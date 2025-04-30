import processing.core.*;
import java.util.*;

public abstract class Level {    
    protected PApplet p;
    protected Background background;
    protected Player player;
    protected EndCheckpoint end;
    protected CollisionDetector collisionDetector;
    protected ArrayList<Platform> platforms;
    protected List<Spike> spikes;
    protected List<Text> messages;
    
    public Level(PApplet p) {
        this.p = p;
        setup();
    }
    
    public abstract void setup();
    
    public void display() {
        p.background(0);
        background.display();
        messages.forEach(Text::display);
        player.display();
        platforms.forEach(Platform::display);
        spikes.forEach(Spike::display);
        end.display();
    }
    
    public void update() {
        background.update();
        player.update();
        for (int i = 0; i < platforms.size(); i++) {
            platforms.get(i).update();
            if (player.getVelocity().y >= 0) {
                if (collisionDetector.checkPlatform(player, platforms.get(i))) {
                    player.resetToPlatform(platforms.get(i));
                }
            }
            if (!platforms.get(i).onScreen()) {
                platforms.remove(i);
            }
        }
        spikes.forEach(Spike::update);
        messages.forEach(Text::update);
        end.update();
    }
    
    public boolean isGameOver() {
        if (!player.withinScreen()) return true;
        
        for (Spike s: spikes) {
            if (collisionDetector.checkSpike(player, s)) return true;
        }
        
        return false;
    }
    
    public boolean levelPassed() {
        if (collisionDetector.checkEndpoint(player, end)) return true;
        return false;
    }
    
    public void levelKeyPressed() {
        player.playerKeyPressed();
    }
    
    public void reset() {
        setup();
    }
}
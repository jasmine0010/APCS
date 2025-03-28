import processing.core.*;
import java.util.*;

public class Level1 implements Level {
    private PApplet p;
    private Background background;
    private Player player;
    private ArrayList<Platform> platforms;
    private ArrayList<Spike> spikes;
    
    public Level1(PApplet p) {
        this.p = p;
        
        background = new Background(p);
        
        player = new Player(p, new PVector(p.width / 2, p.height / 2), new PVector(0, 0), new PVector(0, 0.55f), 10);
        
        platforms = new ArrayList<Platform>();
        platforms.add(new Platform(p, new PVector(300, 500), 47));
        platforms.add(new Platform(p, new PVector(3400, 450), 5));
        platforms.add(new Platform(p, new PVector(3900, 550), 28));
        platforms.add(new Platform(p, new PVector(5900, 550), 50));
        
        spikes = new ArrayList<Spike>();
        spikes.add(new Spike(p, new PVector(6700, 550), 4));
    }

    public void display() {
        p.background(0);
        background.display();
        player.display();
        for (Platform s: platforms) {
            s.display();
        }
        for (Spike s: spikes) {
            s.display();
        }
    }
    
    public void update() {
        background.update();
        player.update();
        for (Platform s: platforms) {
            s.update();
            player.checkPlatform(s);
        }
        for (Spike s: spikes) {
            s.update();
        }
    }
    
    public boolean checkGameOver() {
        if (!player.withinScreen()) return true;
        for (Spike s: spikes) {
            if (player.checkSpike(s)) return true;
        }
        return false;
    }
    
    public void levelKeyPressed() {
        player.playerKeyPressed();
    }
    
    public void reset() {
        Level1 resetLevel = new Level1(p);

        this.player = resetLevel.player;
        this.platforms = resetLevel.platforms;
        this.spikes = resetLevel.spikes;
    }
}
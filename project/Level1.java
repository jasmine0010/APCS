import processing.core.*;
import java.util.*;

public class Level1 implements Level {
    private PApplet p;
    private Background background;
    private Player player;
    private ArrayList<Platform> platforms;
    private List<Spike> spikes;
    private List<Text> messages;
    
    public Level1(PApplet p) {
        this.p = p;
        background = new Background(p);
        player = new Player(p, new PVector(p.width / 2, p.height / 3));
        
        platforms = new ArrayList<Platform>();
        platforms.add(new Platform(p, new PVector(p.width / 5, p.height * 2 / 3), 25, new int[]{30}));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 2300, p.height * 2 / 3 - 50), 5, new int[0]));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 3000, p.height * 2 / 3), 10, new int[0]));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 4400, p.height * 2 / 3 + 50), 5, new int[0]));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 4500, p.height * 2 / 3), 30, new int[0]));
        
        spikes = List.of(
            new Spike(p, new PVector(p.width / 5 + 6400, p.height * 2 / 3), 4)
        );
        
        messages = List.of(
            new Text(p, new PVector(p.width + 600, 450), "Press SPACE to jump", 48, false)
        );
    }

    public void display() {
        p.background(0);
        background.display();
        player.display();
        platforms.forEach(Platform::display);
        spikes.forEach(Spike::display);
        messages.forEach(Text::display);
    }
    
    public void update() {
        background.update();
        player.update();
        for (int i = 0; i < platforms.size(); i++) {
            platforms.get(i).update();
            if (player.getVelocity().y >= 0) {
                player.checkPlatform(platforms.get(i));
            }
            if (!platforms.get(i).onScreen()) {
            platforms.remove(i);
            }
        }
        spikes.forEach(Spike::update);
        messages.forEach(Text::update);
    }
    
    public boolean isGameOver() {
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
        this.messages = resetLevel.messages;
    }
}
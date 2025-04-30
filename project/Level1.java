import processing.core.*;
import java.util.*;

public class Level1 extends Level {    
    
    public Level1(PApplet p) {
        super(p);
    }
    
    @Override
    public void setup() {
        background = new Background(p);
        player = new Player(p, new PVector(p.width / 2, p.height / 3));
        collisionDetector = new CollisionDetector(p);
        end = new EndCheckpoint(p, new PVector(p.width / 5 + 9750, p.height * 2 / 3 + 130));
        
        platforms = new ArrayList<Platform>();
        platforms.add(new Platform(p, new PVector(scaleX(384), scaleY(720)), 25, new int[]{25}, new int[0]));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 2500, p.height * 2 / 3 - 80), 3));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 2950, p.height * 2 / 3), 5, new int[]{5}, new int[0]));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 3550, p.height * 2 / 3 - 80), 3, new int[]{3}, new int[0]));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 3950, p.height * 2 / 3 - 160), 3, new int[0], new int[]{3}));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 4700, p.height * 2 / 3 - 160), 3, new int[]{1}, new int[0]));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 5100, p.height * 2 / 3 - 80), 3));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 5500, p.height * 2 / 3), 25));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 8100, p.height * 2 / 3 + 80), 5));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 8750, p.height * 2 / 3), 7));
        platforms.add(new Platform(p, new PVector(p.width / 5 + 9550, p.height * 2 / 3 + 160), 5));
        
        platforms.add(new Platform(p, new PVector(scaleX(384), scaleY(720)), 25, new int[]{25}, new int[0]));
        platforms.add(new Platform(p, new PVector(scaleX(3509), scaleY(620)), 3));
        platforms.add(new Platform(p, new PVector(scaleX(3334), p.height * 2 / 3), 5, new int[]{5}, new int[0]));
        platforms.add(new Platform(p, new PVector(scaleX(3934), p.height * 2 / 3 - 80), 3, new int[]{3}, new int[0]));
        platforms.add(new Platform(p, new PVector(scaleX(4334), p.height * 2 / 3 - 160), 3, new int[0], new int[]{3}));
        platforms.add(new Platform(p, new PVector(scaleX(5084), p.height * 2 / 3 - 160), 3, new int[]{1}, new int[0]));
        platforms.add(new Platform(p, new PVector(scaleX(5484), p.height * 2 / 3 - 80), 3));
        platforms.add(new Platform(p, new PVector(scaleX(5884), p.height * 2 / 3), 25));
        platforms.add(new Platform(p, new PVector(scaleX(8484), p.height * 2 / 3 + 80), 5));
        platforms.add(new Platform(p, new PVector(scaleX(9134), p.height * 2 / 3), 7));
        platforms.add(new Platform(p, new PVector(scaleX(9934), p.height * 2 / 3 + 160), 5));
        
        spikes = List.of(
            new Spike(p, new PVector(p.width / 5 + 6400, p.height * 2 / 3), 2),
            new Spike(p, new PVector(p.width / 5 + 6800, p.height * 2 / 3), 3),
            new Spike(p, new PVector(p.width / 5 + 7300, p.height * 2 / 3), 4),
            new Spike(p, new PVector(p.width / 5 + 9230, p.height * 2 / 3), 3)
        );
        
        messages = List.of(
            new Text(p, new PVector(p.width + 600, 450), "Press SPACE to jump", 48, true),
            new Text(p, new PVector(p.width + 2800, 250), "You can jump after falling!", 48, true),
            new Text(p, new PVector(p.width + 5000, 450), "Don't touch the spikes", 48, true)
        );
    }
    
    private float scaleX(float n) {
        return Constants.scaleX(n);
    }
    
    private float scaleY(float n) {
        return Constants.scaleY(n);
    }
}
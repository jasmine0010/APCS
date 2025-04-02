import processing.core.*;

public class Spike {
    private static final int MOVE_SPEED = 10;
    private static final int SPIKE_WIDTH = 45;
    
    private PApplet p;
    private PVector position;
    private int numSpikes;
    PImage spike;
    
    public Spike(PApplet p, PVector position, int numSpikes) {
        this.p = p;
        this.position = position;
        this.numSpikes = numSpikes;
        
        spike = p.loadImage("spike.PNG");
        spike.resize(SPIKE_WIDTH, 0);
    }
    
    public void display() {
        for (int i = 0; i < numSpikes; i++) {
            p.image(spike, position.x + i * spike.width, position.y - spike.height);
        }
    }
    
    public void update() {
        position.x -= MOVE_SPEED;
    }
    
    // Accessors
    public PVector getPosition() { return position; }
    public int getNumSpikes() { return numSpikes; }
    public int getWidth() { return numSpikes * spike.width; }
    public int getHeight() { return spike.height; }
}
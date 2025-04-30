import processing.core.*;

public class EndCheckpoint {
    private PApplet p;
    private PVector position;
    
    public EndCheckpoint(PApplet p, PVector position) {
        this.p = p;
        this.position = position;
    }
    
    public void display() {
        p.fill(255);
        p.ellipse(position.x, position.y, 50, 50);
    }
    
    public void update() {
        position.x -= Constants.Physics.MOVE_SPEED;
    }
    
    public PVector getPosition() { return position; }
    public int getWidth() { return 50; }
    public int getHeight() { return 50; }
}
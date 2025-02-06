import processing.core.*;

public class Square {
    private PApplet p;
    private int x, y;
    
    public Square(PApplet p, int x, int y) {
        this.p = p;
        this.x = x;
        this.y = y;
    }
    
    public display() {
        PApplet.square(x, y, 20, 20);
    }
}
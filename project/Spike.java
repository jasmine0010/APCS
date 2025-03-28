import processing.core.*;

public class Spike {
    private PApplet p;
    private PVector pos;
    private int num;
    private int base, height;
    
    public Spike(PApplet p, PVector pos, int num) {
        this.p = p;
        this.pos = pos;
        this.num = num;
        base = 20;
        height = 20;
    }
    
    public void display() {
        for (int i = 0; i < num; i++) {
            p.triangle(pos.x + i * base, pos.y, pos.x + i * base + base / 2, pos.y - height, pos.x + i * base + base, pos.y);
        }
    }
    
    public void update() {
        pos.x -= 10;
    }
    
    public PVector getPos() { return pos; }
    
    public int getBase() { return base; }
    
    public int getHeight() { return height; }
    
    public int getNum() { return num; }
}
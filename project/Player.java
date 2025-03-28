import processing.core.*;

public class Player {
    private PApplet p;
    private PVector pos, v, a;
    private int r;
    private boolean midAir;
    private PImage player;
    
    public Player(PApplet p, PVector pos, PVector v, PVector a, int r) {
        this.p = p;
        this.pos = pos;
        this.v = v;
        this.a = a;
        this.r = r;
        midAir = true;
        
        player = loadImage("player.PNG");
    }
    
    public void display() {
        p.image(player, pos.x, pos.y);
    }
    
    public void update() {
        v.add(a);
        pos.add(v);
    }
    
    public void checkPlatform(Platform s) {
        if (pos.x + r > s.getPos().x
            && pos.x - r < s.getPos().x + s.getNumBlocks() * (s.getBlockWidth() - s.getBorderWidth()) + s.getBorderWidth()
            && pos.y + r > s.getPos().y
            && pos.y - r < s.getPos().y + s.getBlockHeight()) {
            pos.y = s.getPos().y - r;
            a.y = 0;
            midAir = false;

        }
    }
    
    public boolean checkSpike(Spike s) {
        if (pos.x + r > s.getPos().x && pos.x - r < s.getPos().x + s.getBase() * s.getNum() && pos.y + r > s.getPos().y - s.getHeight() && pos.y - r < s.getPos().y) {
            return true;
        }
        return false;
    }
    
    public boolean withinScreen() {
        if (pos.y <= p.height + r && pos.y >= 0 - r && pos.x <= p.width + r && pos.x >= r) {
            return true;
        }
        return false;
    }
    
    public void playerKeyPressed() {
        if (p.key == ' ' && !midAir) {
            v.y = -9;
            a.y = 0.55f;
            midAir = true;
        }
    }
    
    // Accessors
    public PVector getPos() { return pos; }
    public PVector getVel() { return v; }
    public PVector getAcc() { return a; }    
    public int getRadius() { return r; }
}
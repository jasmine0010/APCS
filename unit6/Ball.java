import processing.core.*;


public class Ball {
    private PApplet p; // reference to main PApplet
    private PVector pos; // position
    private PVector v; // velocity
    private PVector a; // acceleration
    private PVector thrustForce;
    private float r; // radius
    private float maxV;
    private boolean thrust;

    public Ball(PApplet p) {
        this.p = p;
        pos = new PVector(200, 200);
        v = new PVector(0, 0);
        a = new PVector(0, 0);
        thrustForce = new PVector(0, 2);
        
        maxV = 3;
        r = 10;
        
        thrust = false;
    }
    
    public void checkEdges() {
        if (pos.x < -r) {
          pos.x = p.width + r;
        } else if (pos.x > p.width + r) {
          pos.x = -r;
        }
        if (pos.y < -r) {
          pos.y = p.height+r;
        }
        if (pos.y > p.height+r) {
          pos.y = -r;
        }
    }
    
    public void applyForce(PVector force) {
        PVector f = new PVector(force.x, force.y);
        a.add(f);
    }
    
    public void ballKeyPressed() {
        if (p.keyCode == p.LEFT) {
            thrustForce = new PVector(-2, 0);
            thrust = true;
        }
        if (p.keyCode == p.RIGHT) {
            thrustForce = new PVector(2, 0);
            thrust = true;
        }
        if (p.keyCode == p.UP) {
            thrustForce = new PVector(0, -2);
            thrust = true;
        }
        if (p.keyCode == p.DOWN) {
            thrustForce = new PVector(0, 2);
            thrust = true;
        }
    }
    
    public void ballKeyReleased() {
        thrust = false;
    }

    public void display() {
        p.fill(255);
        p.ellipse(pos.x, pos.y, r * 2, r * 2);
    }
    
    public void update() {
        v.add(a);
        v.limit(maxV);
        pos.add(v);
        a.mult(0);
        v.mult(0.96f);
        if (thrust) {
            applyForce(thrustForce);
        }
    }
}
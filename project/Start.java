import processing.core.*;

public class Start {
    private PApplet p;
    
    public Start(PApplet p) {
        this.p = p;
    }
    
    public void display() {
        p.background(0);
        p.fill(255);
        p.textSize(30);
        p.textAlign(p.CENTER);
        p.text("GAME", p.width / 2, p.height / 2);
        p.text("Menu (m)", p.width / 2, p.height / 2 + 30);
    }
}
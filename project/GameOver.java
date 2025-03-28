import processing.core.*;

public class GameOver {
    private PApplet p;
    
    public GameOver(PApplet p) {
        this.p = p;
    }
    
    public void display() {
        p.background(0);
        p.fill(255);
        p.textSize(30);
        p.textAlign(p.CENTER);
        p.text("GAME OVER", p.width / 2, p.height / 2);
        p.text("Press R to restart level", p.width / 2, p.height / 2 + 30);
        p.text("Press E to return to menu", p.width / 2, p.height / 2 + 60);
    }
}
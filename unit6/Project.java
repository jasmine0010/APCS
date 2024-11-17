import processing.core.*;

public class Project extends PApplet {
    private Ball b;
    
    public void settings() {
        size(400, 400);
    }
    
    public void setup() {
        textMode(CENTER);
        b = new Ball(this);
    }
    
    public void draw() {
        background(0);
        b.checkEdges();
        b.display();
        b.update();
    }
    
    public void keyPressed() {
        b.ballKeyPressed();
    }

    public void keyReleased() {
        b.ballKeyReleased();
    }
    
    public static void main(String[] args) {
        PApplet.main("Project");
    }
}
import processing.core.*;

public class ConwaysGameOfLife extends PApplet {
    int gridSpace = 20;
    
    public void settings() {
        size(600, 600);
    }
    
    public void setup() {
        for (int i = 0; i < p.width / gridSpace; i += gridSpace) {
            line(i, 0, i, height);
            for (int j = 0; j < p.height / gridSpace; j += gridSpace) {
                line(0, j, width, j);
            }
        }
    }
    
    public void draw() {
        
    }
    
    public static void main() {
        PApplet.main("ConwaysGameOfLife");
    }
}
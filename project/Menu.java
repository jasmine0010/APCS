import processing.core.*;

public class Menu {
    private PApplet p;
    private int[][] levels;
    
    public Menu(PApplet p) {
        this.p = p;
        levels = new int[2][5];
        
    }
    
    public void display() {
        p.background(0);
        p.textSize(30);
        p.textAlign(p.CENTER);
        p.rectMode(p.CENTER);
        
        int count = 1;
        // change
        for (int i = 300; i < 300 + 50 * levels.length; i += 60) {
            for (int j = 200; j < 200 + 50 * levels[0].length; j += 60) {
                p.fill(255);
                p.rect(j, i, 50, 50);
                p.fill(0);
                p.text(Integer.toString(count), j, i);
                count++;
            }
        }
    }
}
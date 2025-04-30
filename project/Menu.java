import processing.core.*;

public class Menu {
    private PApplet p;
    private PImage menuScreen;
    private PImage levelBox;
    private int[][] levels;
    
    public Menu(PApplet p) {
        this.p = p;
        levels = new int[2][5];
        menuScreen = p.loadImage("menu-screen.PNG");
        levelBox = p.loadImage("level-box.PNG");
        menuScreen.resize(0, p.height);
        levelBox.resize((int) Constants.scaleX(125), 0);
    }
    
    public void display() {
        p.image(menuScreen, 0, 0);
        
        // change
        int counter = 1;
        for (int i = 0; i < levels.length; i++) {
            for (int j = 0; j < levels[0].length; j++) {
                float displayY = Constants.scaleX(i * 250 + 375);
                float displayX = Constants.scaleY(j * 250 + 375);
                p.image(levelBox, displayX, displayY);
                p.text(counter, displayX, displayY);
                counter++;
            }
        }
    }
}
import processing.core.*;
import java.util.*;

public class Project extends PApplet {
    private ArrayList<Level> levels;
    private int current;
    private String gameState;
    private Start start;
    private Menu menu;
    private GameOver gameOver;
    
    public void settings() {
        fullScreen();
    }
    
    public void setup() {
        rectMode(CORNER);
        levels = new ArrayList<Level>();
        levels.add(new Level1(this));
        gameState = "START";
        
        start = new Start(this);
        menu = new Menu(this);
        gameOver = new GameOver(this);
    }
    
    public void draw() {
        background(0);
        
        if (gameState == "START") {
            start.display();
        } else if (gameState == "MENU") {
            menu.display();
        } else if (gameState == "LEVEL") {
            levels.get(current).display();
            levels.get(current).update();
            if (levels.get(current).checkGameOver()) gameState = "GAMEOVER";
        } else if (gameState == "GAMEOVER") {
            gameOver.display();
        }
        
        
    }
    
    public void keyPressed() {
        if (gameState == "START") {
            if (key == 'm') gameState = "MENU";
        } else if (gameState == "MENU") {
            if (key == '1') gameState = "LEVEL";
        } else if (gameState == "LEVEL") {
            levels.get(current).levelKeyPressed();
        } else if (gameState == "GAMEOVER") {
            levels.get(current).reset();
            if (key == 'r' || key == 'R') gameState = "LEVEL";
            if (key == 'e' || key == 'E') gameState = "MENU";
        }
    }
    
    public static void main(String[] args) {
        PApplet.main("Project");
    }
}
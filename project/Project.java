import processing.core.*;
import java.util.*;

public class Project extends PApplet {
    private List<Level> levels;
    private int currentLevel;
    private Start start;
    private Menu menu;
    private GameOver gameOver;
    
    enum GameState { START, MENU, LEVEL, PAUSED, GAMEOVER }
    private GameState gameState;
    
    public void settings() {
        fullScreen();
    }
    
    public void setup() {
        levels = new ArrayList<>();
        levels.add(new Level1(this));
        currentLevel = 0;
        gameState = GameState.START;
        
        start = new Start(this);
        menu = new Menu(this);
        gameOver = new GameOver(this);
    }
    
    public void draw() {
        background(0);
        
        switch (gameState) {
            case START:
                start.display();
                break;
            case MENU:
                menu.display();
                break;
            case LEVEL, PAUSED:
                levels.get(currentLevel).display();
                if (gameState != GameState.PAUSED) {
                    levels.get(currentLevel).update();
                }
                if (levels.get(currentLevel).isGameOver()) {
                    gameState = GameState.GAMEOVER;
                }
                break;
            case GAMEOVER:
                gameOver.display();
                break;
        }
    }
    
    public void keyPressed() {
        switch (gameState) {
            case START:
                if (key == 'm') gameState = GameState.MENU;
                break;
            case MENU:
                if (key == '1') gameState = GameState.LEVEL;
                break;
            case LEVEL:
                levels.get(currentLevel).levelKeyPressed();
                if (key == 'r' || key == 'R') {
                    levels.get(currentLevel).reset();
                    gameState = GameState.LEVEL;
                }
                if (key == 'p' || key == 'P') {
                    gameState = GameState.PAUSED;
                }
                break;
            case PAUSED:
                if (key == 'l' || key == 'L') {
                    gameState = GameState.LEVEL;
                }
            case GAMEOVER:
                if (key == 'r' || key == 'R') {
                    levels.get(currentLevel).reset();
                    gameState = GameState.LEVEL;
                }
                if (key == 'e' || key == 'E') {
                    gameState = GameState.MENU;
                }
                break;
        }
    }
    
    public static void main(String[] args) {
        PApplet.main("Project");
    }
}
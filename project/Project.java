import processing.core.*;
import java.util.*;

public class Project extends PApplet {
    private List<Level> levels;
    private int currentLevel;
    private Start start;
    private Menu menu;
    private EndScene endScene;
    
    enum GameState { START, MENU, LEVEL, PAUSED, GAMEOVER, LEVEL_PASSED }
    private GameState gameState;
    
    public void settings() {
        fullScreen();
    }
    
    public void setup() {
        Constants.setPApplet(this);
        
        levels = new ArrayList<>();
        levels.add(new Level1(this));
        levels.add(new Level2(this));
        currentLevel = 0;
        gameState = GameState.START;
        
        start = new Start(this);
        menu = new Menu(this);
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
                if (levels.get(currentLevel).levelPassed()) {
                    gameState = GameState.LEVEL_PASSED;
                }
                break;
            case GAMEOVER:
                endScene = new EndScene(this, false);
                endScene.display();
                break;
            case LEVEL_PASSED:
                endScene = new EndScene(this, true);
                endScene.display();
        }
    }
    
    public void keyPressed() {
        switch (gameState) {
            case START:
                gameState = GameState.MENU;
                break;
            case MENU:
                if (key == '1') {
                    currentLevel = 0;
                    gameState = GameState.LEVEL;
                }
                if (key == '2') {
                    currentLevel = 1;
                    gameState = GameState.LEVEL;
                }
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
                break;
            case GAMEOVER:
                if (key == 'r' || key == 'R') {
                    levels.get(currentLevel).reset();
                    gameState = GameState.LEVEL;
                }
                if (key == 'e' || key == 'E') {
                    gameState = GameState.MENU;
                }
                break;
            case LEVEL_PASSED:
                if (key == 'r' || key == 'R') {
                    levels.get(currentLevel).reset();
                    gameState = GameState.LEVEL;
                }
                if (key == 'e' || key == 'E') {
                    gameState = GameState.MENU;
                }
                if (key == ' ') {
                    currentLevel++;
                    gameState = GameState.LEVEL;
                }
                break;
        }
    }
    
    public static void main(String[] args) {
        PApplet.main("Project");
    }
}
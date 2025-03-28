import processing.core.*;

public class Background {
    private PApplet p;
    private PImage[] layers;
    private int[] xPositions;
    private int[] speeds;
    
    public Background(PApplet p) {
        this.p = p;
        
        layers = new PImage[] {
            p.loadImage("background.PNG"),
            p.loadImage("buildingsBack.PNG"),
            p.loadImage("buildingsMid.PNG"),
            p.loadImage("buildingsFront.PNG")
        };
            
        for (int i = 0; i < layers.length; i++) {
            layers[i].resize(0, p.height);
        }
        
        xPositions = new int[layers.length];
        speeds = new int[] {3, 6, 8, 10};
    }
    
    public void display() {
        for (int i = 0; i < layers.length; i++) {
            p.image(layers[i], xPositions[i], 0);
            p.image(layers[i], xPositions[i] + layers[i].width, 0);
        }
    }
    
    public void update() {
        for (int i = 0; i < layers.length; i++) {
            xPositions[i] -= speeds[i];
            if (xPositions[i] <= -layers[i].width) {
                xPositions[i] = 0;
            }
        }
    }
}
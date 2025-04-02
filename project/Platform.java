import processing.core.*;
import java.util.*;

/**
 *  Represents a platform consisting of multiple blocks.
 *  - Blocks alternate between two base designs
 *  - Blocks have randomly selected pattern designs.
 *  - Platform moves continuously to the left.
 */
public class Platform {
    private static final int MOVE_SPEED = 10;
    private static final int BLOCK_WIDTH = 100;
    
    private PApplet p;
    private PVector position;
    private int numBlocks, borderWidth;
    private PImage jumpIndicator;
    private PImage[] baseBlocks;
    private PImage[] patternBlocks;
    private int[] selectedPatterns;
    private Set<Integer> jumpPositions;
    
    public Platform(PApplet p, PVector position, int numBlocks, int[] jumpPositions) {
        this.p = p;
        this.position = position;
        this.numBlocks = numBlocks;
        this.borderWidth = 13;
        this.jumpPositions = new HashSet<>();
        for (int pos: jumpPositions) this.jumpPositions.add(pos - 1);
        
        jumpIndicator = loadAndResize("jump-indicator.PNG", BLOCK_WIDTH, 0);
        // Load alternating block designs
        baseBlocks = new PImage[] {
            loadAndResize("block-base-1.PNG", BLOCK_WIDTH, 0),
            loadAndResize("block-base-2.PNG", BLOCK_WIDTH, 0),
        };
        
        // Load pattern designs
        patternBlocks = new PImage[13];
        for (int i = 0; i < patternBlocks.length; i++) {
            patternBlocks[i] = loadAndResize("pattern" + (i + 1) + ".PNG", BLOCK_WIDTH, 0);
        }
        
        // Randomize patterns for each block
        selectedPatterns = new int[numBlocks];        
        for (int i = 0; i < numBlocks; i++) {
            // 50% chance of no pattern, otherwise randomly select
            selectedPatterns[i] = (p.random(1) < 0.5) ? -1: (int) p.random(patternBlocks.length);
        }
    }
    
    public void display() {
        for (int i = 0; i < numBlocks; i++) {
            float displayX = position.x + i * (baseBlocks[0].width - borderWidth);
            
            // Alternate between the block types
            if (jumpPositions.contains(i)) {
                p.image(jumpIndicator, displayX, position.y);
            } else {
                p.image(baseBlocks[i % baseBlocks.length], displayX, position.y);
                if (selectedPatterns[i] != -1) {
                    p.image(patternBlocks[selectedPatterns[i]], displayX, position.y);
                }
            }
        }
        
        //p.rectMode(p.CORNER);
        //p.rect(position.x, position.y, length, height);
    }
    
    public boolean onScreen() {
        return position.x + numBlocks * (BLOCK_WIDTH - borderWidth) + borderWidth >= 0;
    }
    
    public void update() {
        position.x -= MOVE_SPEED;
    }
    
    private PImage loadAndResize(String filename, int newWidth, int newHeight) {
        PImage img = p.loadImage(filename);
        img.resize(newWidth, newHeight);
        return img;
    }
    
    // Accessors
    public PVector getPosition() { return position; }
    public int getSpeed() { return MOVE_SPEED; }
    public int getNumBlocks() { return numBlocks; }
    public int getWidth() { return numBlocks * (BLOCK_WIDTH - borderWidth) + borderWidth; }
    public int getHeight() { return baseBlocks[0].height; }
}
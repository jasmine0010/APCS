import processing.core.*;

/**
 * A platform of multiple blocks.
 * Blocks have alternating base designs and randomly selected pattern designs.
 * Moves continuously to the left.
 */
public class Platform {
    private PApplet p;
    private PVector pos;
    private int numBlocks, borderWidth;
    private PImage[] blockTypes;
    private PImage[] blockPatterns;
    private int[] finalPatterns;
    
    public Platform(PApplet p, PVector pos, int numBlocks) {
        this.p = p;
        this.pos = pos;
        this.numBlocks = numBlocks;
        borderWidth = 13;
        
        // Load alternating block designs
        blockTypes = new PImage[2];
        blockTypes[0] = loadAndResize("block1.PNG", 75, 0);
        blockTypes[1] = loadAndResize("block2.PNG", 75, 0);
        
        // Load pattern designs
        blockPatterns = new PImage[14];
        for (int i = 0; i < blockPatterns.length; i++) {
            blockPatterns[i] = loadAndResize("pattern" + (i + 1) + ".PNG", 75, 0);
        }
        
        // Randomize patterns for the platform
        finalPatterns = new int[numBlocks];        
        for (int i = 0; i < numBlocks; i++) {
            // 50% chance of pattern 13 (empty), otherwise randomly select
            finalPatterns[i] = (p.random(1) < 0.5) ? 13: (int) p.random(blockPatterns.length);
        }
    }
    
    public void display() {
        for (int i = 0; i < numBlocks; i++) {
            // Calculate x position, remove outer right edge
            float displayX = pos.x + i * (blockTypes[0].width - borderWidth);
            
            // Alternate between the two block types
            p.image(blockTypes[i % 2], displayX, pos.y);
            
            // Display preselected pattern
            p.image(blockPatterns[finalPatterns[i]], displayX, pos.y);
        }
        
        //p.rectMode(p.CORNER);
        //p.rect(pos.x, pos.y, length, height);
    }
    
    public void update() {
        pos.x -= 10;
    }
    
    private PImage loadAndResize(String filename, int newWidth, int newHeight) {
        PImage img = p.loadImage(filename);
        img.resize(newWidth, newHeight);
        return img;
    }
    
    // Accessors
    public PVector getPos() { return pos; }
    public int getNumBlocks() { return numBlocks; }
    public int getBlockWidth() { return blockTypes[0].width; }
    public int getBlockHeight() { return blockTypes[0].height; }
    public int getBorderWidth() { return borderWidth; }
}
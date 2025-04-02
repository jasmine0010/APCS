import processing.core.*;

/** Represents the player
 * 
 * 
 * 
 */
public class Player {
    private static final float GRAVITY = 0.8f;
    private static final float JUMP_FORCE = -16f;
    
    private PApplet p;
    private PVector position, velocity, acceleration;
    private boolean isJumping;
    private PImage player;    
    
    public Player(PApplet p, PVector position) {
        this.p = p;
        this.position = position;
        this.velocity = new PVector(0, 0);
        this.acceleration = new PVector(0, GRAVITY);
        this.isJumping = true;
        
        player = p.loadImage("player.PNG");
        player.resize(120, 0);
    }
    
    public void display() {
        p.image(player, position.x, position.y);
    }
    
    public void update() {
        velocity.add(acceleration);
        position.add(velocity);
    }
    
    public void checkPlatform(Platform platform) {
        boolean isOnTop =
            position.x + player.width > platform.getPosition().x &&
            position.x < platform.getPosition().x + platform.getWidth() &&
            position.y + player.height >= platform.getPosition().y &&
            position.y < platform.getPosition().y + platform.getHeight();
        
        boolean isOnLeft =
            position.y + player.height > platform.getPosition().y &&
            position.y < platform.getPosition().y + platform.getHeight() &&
            position.x + player.width > platform.getPosition().x &&
            position.x < platform.getPosition().x + platform.getWidth();
        
        if (isOnTop) {
            position.y = platform.getPosition().y - player.height;
            acceleration.y = 0;
            isJumping = false;
        } else if (isOnLeft) {
            position.x -= platform.getSpeed();
        }
    }
    
    public boolean checkSpike(Spike spike) {
        return position.x + player.width >= spike.getPosition().x &&
            position.x <= spike.getPosition().x + spike.getWidth() &&
            position.y + player.width >= spike.getPosition().y &&
            position.y <= spike.getPosition().y - spike.getHeight();
    }
    
    public boolean withinScreen() {
        return position.y <= p.height &&
            position.y + player.height >= 0 &&
            position.x <= p.width &&
            position.x + player.width >= 0;
    }
    
    public void jump() {
        if (!isJumping) {
            velocity.y = JUMP_FORCE;
            acceleration.y = GRAVITY;
            isJumping = true;
        }
    }
    
    public void playerKeyPressed() {
        if (p.key == ' ') {
            jump();
        }
    }
    
    // Accessors
    public PVector getPosition() { return position; }
    public PVector getVelocity() { return velocity; }
    public PVector getAcceleration() { return acceleration; }    
    public int getWidth() { return player.width; }
    public int getHeight() { return player.height; }
}
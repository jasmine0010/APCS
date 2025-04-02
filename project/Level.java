public interface Level {
    public void display();
    
    public void update();
    
    public void levelKeyPressed();
    
    public boolean isGameOver();
    
    public void reset();
}
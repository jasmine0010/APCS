public interface Level {
    public void display();
    
    public void update();
    
    public void levelKeyPressed();
    
    public boolean checkGameOver();
    
    public void reset();
}
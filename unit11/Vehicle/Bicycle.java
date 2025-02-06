public class Bicycle implements Vehicle{
    public String getName() {
        return "Bicycle";
    }
    
    public int getWheelCount() {
        return 2;
    }
    
    public boolean isHumanPowered() {
        return true;
    }
}
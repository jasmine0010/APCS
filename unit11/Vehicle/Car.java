public class Car implements Vehicle {    
    public String getName() {
        return "Car";
    }
    
    public int getWheelCount() {
        return 4;
    }
    
    public boolean isHumanPowered() {
        return false;
    }
}
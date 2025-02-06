import java.util.*;

public class VehicleStats {
    public static int getTotalWheels(ArrayList<Vehicle> vehicles) {
        int sum = 0;
        
        for (Vehicle v: vehicles) {
            sum += v.getWheelCount();
        }
        
        return sum;
    }
    
    public static ArrayList<Vehicle> getHumanPoweredVehicles(ArrayList<Vehicle> vehicles) {
        ArrayList<Vehicle> result = new ArrayList<Vehicle>();
        
        for (Vehicle v: vehicles) {
            if (v.isHumanPowered()) result.add(v);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Bicycle());
        vehicles.add(new Unicycle());
        
        System.out.println("Total wheels: " + getTotalWheels(vehicles) + "\nHuman powered vehicles: ");
        for (Vehicle v: getHumanPoweredVehicles(vehicles)) {
            System.out.println(v.getName());
        }
    }
}
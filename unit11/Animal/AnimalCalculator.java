import java.util.*;

public class AnimalCalculator {
    public static void printStats(ArrayList<Animal> animals) {
        for (Animal a: animals) {
            System.out.println(a.getName() + " " + a.getLegCount() + " " + a.isFurry());
        }
    }
    
    public static double getAvgLegs(ArrayList<Animal> animals) {
        int sum = 0;
        
        for (Animal a: animals) {
            sum += a.getLegCount();
        }
        
        return (double)sum / animals.size();
    }
    
    public static Animal getLeastLegs(ArrayList<Animal> animals) {
        int legCount = 1000000;
        Animal result = new Animal("", 0, false);
        
        for (Animal a: animals) {
            if (legCount > a.getLegCount()) {
                legCount = a.getLegCount();
                result = a;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat());
        animals.add(new Human());
        animals.add(new Sponge());
        animals.add(new Centipede());
        
        printStats(animals);
        System.out.println("Average legs: " + getAvgLegs(animals) + "  Least legs: " + getLeastLegs(animals).getName());
    }
}
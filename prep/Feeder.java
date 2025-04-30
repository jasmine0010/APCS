public class Feeder {
    private int currentFood;
    
    public Feeder(int currentFood) {
        this.currentFood = currentFood;
    }
    
    public void simulateOneDay(int numBirds) {
        int condition = (int) Math.random(1, 101);
        
        if (condition <= 5) {
            currentFood = 0;
            return;
        }
        
        int portion = (int) Math.random(10, 51);
        int foodEaten = portion * numBirds;
        
        if (foodEaten > currentFood) currentFood = 0;
        else currentFood -= foodEaten;
    }
    
    public int simulateManyDays(int numBirds, int numDays) {
        int countDays = 0;
        for (int i = 0; i < numDays; i++) {
            if (currentFood > 0) countDays++;
            simulateOneDay(numBirds);
        }
        return countDays;
    }
}
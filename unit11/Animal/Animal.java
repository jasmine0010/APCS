public class Animal {
    private String name;
    private int legCount;
    private boolean isFurry;
    
    public Animal(String name, int legCount, boolean isFurry) {
        this.name = name;
        this.legCount = legCount;
        this.isFurry = isFurry;
    }
    
    public String getName() {
        return name;
    }
    
    public int getLegCount() {
        return legCount;
    }
    
    public boolean isFurry() {
        return isFurry;
    }
}
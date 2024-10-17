public class Person {
    private String name;
    private int numOfPets;
    
    public Person(String nameIn, int numOfPetsIn) {
        name = nameIn;
        numOfPets = numOfPetsIn;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNumOfPets() {
        return numOfPets;
    }
    
    public void greeting() {
        System.out.println("Hello, my name is " + name + " and I have " + numOfPets + " pet(s).");
    }
}
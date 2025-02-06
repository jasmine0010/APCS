/*a) Write a class Person, including:

private member variables for the person’s name (String) and number of pets (int)

a constructor that sets these member variables

public accessor functions for the member variables*/

public class Person {
    private String name;
    private int numPets;
    
    public Person(String name, int numPets) {
        this.name = name;
        this.numPets = numPets;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNumPets() {
        return numPets;
    }
}
import java.util.*;

public class PersonStats {
    public static double getAveragePets(ArrayList<Person> persons) {
        int sum = 0;
        
        for (Person p: persons) sum += p.getNumPets();
        
        return sum / persons.size();
    }
    
    public static String getPersonWithMostPets(ArrayList<Person> persons) {
        int maxPets = 0;
        String name = "";
        
        for (Person p: persons) {
            if (p.getNumPets() > maxPets) {
                maxPets = p.getNumPets();
                name = p.getName();
            }
        }
        
        return name;
    }
    
    public static ArrayList<Person> getAtLeastTwoPets(ArrayList<Person> persons) {
        ArrayList<Person> result = new ArrayList<Person>();
        
        for (Person p: persons) {
            if (p.getNumPets() >= 2) result.add(p);
        }
        
        return result;
    }
    
    public static void main(String args[]) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Jasmine", 0));
        persons.add(new Person("Julia", 2));
        persons.add(new Person("Claire", 3));
        
        for (Person p: persons) System.out.println(p.getName() + " " + p.getNumPets() + "\n");
        
        System.out.println("Average # of pets: " + getAveragePets(persons) + "  Most pets: " + getPersonWithMostPets(persons) + "\n\nAt least 2 pets:");
        
        for (Person p: getAtLeastTwoPets(persons)) System.out.println(p.getName() + " ");
    }
}
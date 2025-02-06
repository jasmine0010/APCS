public class TestPerson {
    public static void main(String args[]) {
        Person drKessner = new Person("Dr. Kessner", 1);
        
        System.out.println("Name : " + drKessner.getName() + "  Pet(s): " + drKessner.getNumOfPets());
        drKessner.greeting();
    }
}
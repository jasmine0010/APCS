public class Greetings {
    public static String greetings(String name) {
        return "Hello, " + name + ", how are you?";
    }
    
    public static void testGreetings(String name) {
        String result = greetings(name);
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        testGreetings("Sarah");
        testGreetings("Dr. Kessner");
        testGreetings("Ascii Cat");
    }
}
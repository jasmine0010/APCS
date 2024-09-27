public class Attention {
    public static boolean attention(String str) {
        if (str.substring(0, 8).equals("Hey you!")) return true;
        return false;
    }
    
    public static void testAttention(String str, boolean expected) {
        boolean result = attention(str);
        System.out.print("String: " + str + "  Expected: " + expected + "  Result: " + result);
        
        if (result == expected) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }

    public static void main(String[] args) {
        testAttention("Hello, how are you?", false);
        testAttention("Hey you! Give me your code.", true);
        testAttention("Hi, what is your name?", false);
    }
}
class Reverse {
    public static String reverse(String str) {
        String newStr = "";
        
        for (int i = str.length() - 1; i >= 0; i --) {
            newStr += str.substring(i, i + 1);
        }
        
        return newStr;
    }
    
    public static void testReverse(String str, String expected) {
        String result = reverse(str);
        
        System.out.print("String: " + str + "  Expected: " + expected + "  Result: " + result);
        
        if (result.equals(expected)) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }
    
    public static void main(String args[]) {
        testReverse("bad", "dab");
        testReverse("Hello, world!", "!dlrow ,olleH");
        testReverse("tacocat", "tacocat");
        testReverse("weather", "rehtaew");
        testReverse("Coffee", "eeffoC");
    }
}
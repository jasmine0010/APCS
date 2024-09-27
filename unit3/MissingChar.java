public class MissingChar {
    public static String missingChar(String str, int n) {
      String newStr = "";
      newStr = str.substring(0, n).concat(str.substring(n+1));
      return newStr;
    }
    
    public static void testMissingChar(String str, int n, String expected) {
        String result = missingChar(str, n);
        
        System.out.print("String: " + str + "  Index: " + n + "  Expected: " + expected + "  Result: " + result);
        
        if (result.equals(expected)) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }

    public static void main(String[] args) {
        testMissingChar("code", 1, "cde");
        testMissingChar("chocolate", 8, "chocolat");
        testMissingChar("Hi", 0, "i");
    }
}
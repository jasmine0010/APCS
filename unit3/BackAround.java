public class BackAround {
    public static String backAround(String str) {
      char last = str.charAt(str.length() - 1);
      String newStr = Character.toString(last)
                               .concat(str)
                               .concat(Character.toString(last));
      return newStr;
    }
    
    public static void testBackAround(String str, String expected) {
        String result = backAround(str);
        
        System.out.print("String: " + str + "  Expected: " + expected + "  Result: " + result);
        
        if (result.equals(expected)) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }

    
    public static void main(String[] args) {
        testBackAround("cat", "tcatt");
        testBackAround("read", "dreadd");
        testBackAround("a", "aaa");
    }
}
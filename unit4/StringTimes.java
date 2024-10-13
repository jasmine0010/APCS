public class StringTimes {
    public static String stringTimes(String str, int n) {
      String newStr = "";
      for (int i = 0; i < n; i ++)
        newStr = newStr.concat(str);
      return newStr;
    }
    
    public static void testStringTimes(String str, int n, String expected) {
        String result = stringTimes(str, n);
        
        System.out.print("String: " + str + "  Number: " + n + "  Expected: " + expected + "  Result: " + result);
        
        if (result.equals(expected)) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }
    
    public static void main(String args[]) {
        testStringTimes("Hi", 2, "HiHi");
        testStringTimes("code", 3, "codecodecode");
        testStringTimes("", 4, "");
    }
}
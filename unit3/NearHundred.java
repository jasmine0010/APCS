public class NearHundred {
    public static boolean nearHundred(int n) {
      if (Math.abs(200-n) <= 10 || Math.abs(100-n) <= 10)
        return true;
      return false;
    }
    
    public static void nearHundredTest(int n, boolean expected) {
        boolean result = nearHundred(n);        
        System.out.print("Number: " + n + "  Expected: " + expected + "  Result: " + result);
        
        if (expected == result) System.out.println("  Correct");
        else System.out.println("  Incorrect");
    }
    
    public static void main(String[] args) {
        nearHundredTest(89, false);
        nearHundredTest(-110, false);
        nearHundredTest(209, true);
    }
}
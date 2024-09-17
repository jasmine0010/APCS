public class ParrotTrouble {
    public static boolean parrotTrouble(boolean talking, int hour) {
      if ((hour < 7 || hour > 20) && talking) return true;
      return false;
    }
    
    public static void testParrotTrouble(boolean talking, int hour, boolean expected) {
        boolean result = parrotTrouble(talking, hour);
        
        System.out.print("Talking: " + talking + "  Hour: " + hour + "  Expected: " + expected + "  Result: " + result);
        
        if (result == expected) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }

    public static void main(String[] args) {
        testParrotTrouble(true, 6, true);
        testParrotTrouble(false, 21, false);
        testParrotTrouble(true, 7, false);
        testParrotTrouble(false, 12, false);
    }
}
public class IsVampire {
    public static boolean isVampire(float hour, boolean awake) {
        if (hour > 6 && hour < 22 && !awake || (hour < 6 || hour > 22) && awake)
            return true;
        return false;
    }
    
    public static void testIsVampire(float hour, boolean awake, boolean expected) {
        boolean result = isVampire(hour, awake);
        System.out.print("Hour: " + hour + "  Awake: " + awake + "  Expected: " + expected + "  Result: " + result);
        
        if (result == expected) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }
    
    public static void main(String[] args){
        testIsVampire(5, true, true);
        testIsVampire(10, true, false);
        testIsVampire(23, false, false);
    }
}
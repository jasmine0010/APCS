import java.util.*;

public class CountZNames {
    public static int countZNames(ArrayList<String> arr) {
        int sum = 0;
        for (String a: arr) {
            if (a.substring(0, 1).equals("z") || a.substring(0, 1).equals("Z"))
                sum += a.length();
        }
        return sum;
    }
    
    public static void testCountZNames(ArrayList<String> arr, int expected) {
        int result = countZNames(arr);
        
        System.out.print("ArrayList:");
        
        for (String a: arr) System.out.print(" " + a);
        
        System.out.print("  Expected: " + expected + "  Result: " + result);
        
        if (expected == result) System.out.println("   Correct.");
        else System.out.println("   Incorrect.");
    }
    
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("Dr. Kessner", "Dr. Sands"));
        ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("Zorro", "zero", "zippy"));
        
        testCountZNames(arr1, 0);
        testCountZNames(arr2, 14);
    }
}
import java.util.*;

public class CountLucky {
    public static int countLucky(ArrayList<Integer> arr) {
        int count = 0;
        for (int a: arr)
            if (a % 7 == 0 || a % 10 == 7) count++;
        return count;
    }
    
    public static void testCountLucky(ArrayList<Integer> arr, int expected) {
        int result = countLucky(arr);
        
        System.out.print("ArrayList:");
        
        for (int a: arr) System.out.print(" " + a);
        
        System.out.print("  Expected: " + expected + "  Result: " + result);
        
        if (result == expected) System.out.println("   Correct.");
        else System.out.println("   Incorrect.");
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(7, 13, 17));
        ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(107, 207));
        
        testCountLucky(arr1, 0);
        testCountLucky(arr2, 2);
        testCountLucky(arr3, 2);
    }
}
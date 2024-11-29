import java.util.*;

public class SumOfSquares {
    public static double sumOfSquares(ArrayList<Double> arr) {
        double sum = 0;        
        for (double a: arr) {
            sum += a * a;
        }
        return sum;
    }
    
    public static void testSumOfSquares(ArrayList<Double> arr, double expected) {
        double result = sumOfSquares(arr);
        
        System.out.print("ArrayList:");
        
        for (double a: arr) System.out.print(" " + a);
        
        System.out.print("  Expected: " + expected + "  Result: " + result);
        
        if (expected == result) System.out.println("   Correct.");
        else System.out.println("   Incorrect.");
    }
    
    public static void main(String[] args) {
        ArrayList<Double> arr1 = new ArrayList<Double>(Arrays.asList(0.0));
        ArrayList<Double> arr2 = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0));
        ArrayList<Double> arr3 = new ArrayList<Double>(Arrays.asList(2.0, 2.0, 2.0));
            
        testSumOfSquares(arr1, 0.0);
        testSumOfSquares(arr2, 14.0);
        testSumOfSquares(arr3, 12.0);
    }
}
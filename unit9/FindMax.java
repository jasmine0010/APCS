import java.util.*;

public class FindMax {
    public static double findMax(ArrayList<Double> arr) {
        double max = arr.get(0);
        
        for (double a: arr)
            if (a > max) max = a;
        
        return max;
    }
    
    public static void main(String[] args) {
        ArrayList<Double> arr1 = new ArrayList<Double>(Arrays.asList(1.0, 2.1, 5.3));
        ArrayList<Double> arr2 = new ArrayList<Double>(Arrays.asList(0.0, -35.0, 90.1));
        
        System.out.println("Result: " + findMax(arr1) + "\n" + findMax(arr2));
    }
}
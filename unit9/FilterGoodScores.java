import java.util.*;

public class FilterGoodScores {
    public static ArrayList filterGoodScores(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int a: arr)
            if (a > 90) result.add(a);
        
        return result;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(51, 52, 53, 100));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(92, 89, 90, 99));
        
        System.out.println("Results:\n" + filterGoodScores(arr1) + "\n" + filterGoodScores(arr2));
    }
}
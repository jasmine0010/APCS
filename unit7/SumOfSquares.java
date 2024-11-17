public class SumOfSquares {
    public static double sumOfSquares(double[] nums) {
        double sum = 0;
        for (double num: nums) {
            sum += num * num;
        }
        return sum;
    }
    
    public static void testSumOfSquares(double[] nums, double expected) {
        double result = sumOfSquares(nums);
        
        System.out.print("Numbers: ");
        for (double num: nums) System.out.print(num + " ");
        System.out.print(" Expected: " + expected);
        
        if (result == expected) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }
    
    public static void main(String[] args) {
        double[] arr1 = {0};
        double[] arr2 = {1.0, 2.0, 3.0};
        double[] arr3 = {2.0, 2.0, 2.0};
        testSumOfSquares(arr1, 0);
        testSumOfSquares(arr2, 14.0);
        testSumOfSquares(arr3, 12.0);
    }
}
public class CountLucky {
    public static int countLucky(int[] nums) {
        int sum = 0;
        for (int num: nums) {
            if (num % 7 == 0 || num % 10 == 7) sum ++;
        }
        return sum;
    }
    
    public static void testCountLucky(int[] nums, int expected) {
        int result = countLucky(nums);
        
        System.out.print("Numbers: ");
        for (int num: nums) System.out.print(num + " ");
        System.out.print(" Expected: " + expected);
        
        if (result == expected) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 13, 17};
        int[] arr3 = {107, 207};
        testCountLucky(arr1, 0);
        testCountLucky(arr2, 2);
        testCountLucky(arr3, 2);
    }
}
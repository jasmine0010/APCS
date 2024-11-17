public class CountZNames {
    public static int countZNames(String[] arr) {
        int sum = 0;
        for (String str: arr) {
            if (str.substring(0, 1).equals("z") || str.substring(0, 1).equals("Z")) {
                sum += str.length();
            }
        }
        return sum;
    }
    
    public static void testCountZNames(String[] arr, int expected) {
        int result = countZNames(arr);
        
        System.out.print("Strings: ");
        for (String str: arr) System.out.print(str + " ");
        System.out.print(" Expected: " + expected);
        
        if (result == expected) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }
    
    public static void main(String[] args) {
        String[] arr1 = {"Dr. Kessner", "Dr. Sands"};
        String[] arr2 = {"Zorro", "zero", "zippy"};
        testCountZNames(arr1, 0);
        testCountZNames(arr2, 14);
    }
}
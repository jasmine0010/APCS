public class Fibonacci {
    public static int[] fibonacci(int n) {
        if (n == 0) {
            int[] arr = {};
            return arr;
        } else if (n == 1) {
            int[] arr = {1};
            return arr;
        } else if (n == 2) {
            int[] arr = {1, 1};
            return arr;
        }
        
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        
        for (int i = 2; i < n; i ++) {
            arr[i] = (int)(arr[i - 1]) + (int)(arr[i - 2]);
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int n: fibonacci(i)) {
                System.out.print(n + " ");
            }
            System.out.println("");
        }
    }
}
class SumOfSquares {
    public static int sumOfSquares(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i ++) {
            sum += i*i;
        }
        
        return sum;
    }
    
    public static void testSumOfSquares(int n, int expected) {
        int result = sumOfSquares(n);
        
        System.out.print("Number: " + n + "  Expected: " + expected + "  Result: " + result);
        
        if (result == expected) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }
    
    public static void main(String args[]) {
        testSumOfSquares(1, 1);
        testSumOfSquares(2, 5);
        testSumOfSquares(3, 14);
        testSumOfSquares(4, 30);
        testSumOfSquares(5, 55);
    }
}
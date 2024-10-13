class Factorial {
    public static int factorial(int num) {
        int product = 1;
        
        for (int i = 1; i <= num; i ++) {
            product *= i;
        }
        
        return product;
    }

    public static void testFactorial(int num, int expected) {
        int result = factorial(num);
        
        System.out.print("Number: " + num + "  Expected: " + expected + "  Result: " + result);
        
        if (expected == result) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }
    
    public static void main(String args[]) {
        testFactorial(0, 1);
        testFactorial(1, 1);
        testFactorial(2, 2);
        testFactorial(3, 6);
        testFactorial(4, 24);
        testFactorial(5, 120);
    }
}
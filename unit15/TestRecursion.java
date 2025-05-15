public class TestRecursion {
    
    public static int sumToN(int n) {
        if (n == 1) return n;
        return n + sumToN(n - 1);
    }
    
    /* 3, 6, 12, ... */
    public static int nthNum(int n) {
        if (n == 1) return 3;
        return 2 * nthNum(n - 1);
    }
    
    public static int nthFib(int n) {
        if (n == 1 || n == 2) return 1;
        return nthFib(n - 1) + nthFib(n - 2);
    }
    
    public static void main(String[] args) {
        System.out.println("Sum from 1 to 4: " + sumToN(4));
        System.out.println("4th number of 3, 6, 12, ... : " + nthNum(4));
        System.out.println("5th number of fibonacci: " + nthFib(5));
    }
}
public class Fibonacci {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;
        System.out.println(1 + "\n" + 1);
        for (int i = 0; i <= 10; i ++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
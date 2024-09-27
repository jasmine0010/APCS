public class RollDie {
    public static int rollDie() {
        return (int)(Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i ++) {
            System.out.println(rollDie());
        }
    }
}
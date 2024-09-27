public class CoinFlip {
    public static String coinFlip() {
        int n = (int)(Math.random() * 10);
        if (n >= 5) return "Heads";
        else return "Tails";
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i ++) {
            System.out.println(coinFlip());
        }
    }
}
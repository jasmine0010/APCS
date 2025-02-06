public class TestMagicEightBall {
    public static void main(String args[]) {
        MagicEightBall eightBall = new MagicEightBall();
        
        String question = "Will the trees grow?";
        
        System.out.println(question + " " +eightBall.ask(question));
    }
}
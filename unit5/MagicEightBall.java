public class MagicEightBall {
    
    private final String[] answers = {"It is certain", "Most likely", "Reply hazy, try again", "Better not tell you now", "Don’t count on it", "Very doubtful"};
        
    public String ask(String str) {
        int num = (int)(Math.random() * 6);
        
        return answers[num];
    }
}
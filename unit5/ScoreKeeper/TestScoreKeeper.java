public class TestScoreKeeper {
    public static void main(String args[]) {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        
        System.out.println(scoreKeeper.getScore());
        scoreKeeper.scoreNormal();
        System.out.println(scoreKeeper.getScore());
        scoreKeeper.scoreBonus();
        System.out.println(scoreKeeper.getScore());
    }
}
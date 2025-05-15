import java.util.*;

public class WordSentence {
    private static String sentence = "a cat is not a dog";
    
    public static int countWords() {
        return 6;
    }
    
    public static ArrayList<Integer> getBlankPositions() {
        ArrayList<Integer> blankPositions = new ArrayList<Integer>();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.substring(i, i+1).equals(" ")) {
                blankPositions.add(i);
            }
        }
        return blankPositions;
    }
    
    public static String[] getWords() {
        ArrayList<Integer> blanks = getBlankPositions();
        int wordCount = countWords();
        String[] words = new String[wordCount];
        words[0] = sentence.substring(0, blanks.get(0));
        for (int i = 1; i < blanks.size(); i++) {
            words[i] = sentence.substring(blanks.get(i-1) + 1, blanks.get(i));
        }
        return words;
    }
    
    public static void main(String[] args) {
        System.out.println(sentence);
        for (String s: getWords()) {
            System.out.print(s + " ");
        }
    }
}
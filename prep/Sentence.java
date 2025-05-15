/*This question refers to the Sentence class below. Note: A word is a
string of consecutive non-blank (and non-whitespace) characters. For
example, the sentence
"Hello there!" she said.

consists of the four words*/

public class Sentence {
    private String sentence;
    private int numWords;
    
    /* (a) Complete the Sentence constructor as started below. The constructor
    assigns str to sentence. You should write the subsequent code that
    assigns a value to numWords, the number of words in sentence.
    Complete the constructor below:*/
    public Sentence(String str) {
        sentence = str;
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(" ")) count++;
        }
        numWords = count + 1;
    }
    
    /*(b) Consider the problem of testing whether a string is a palindrome. A
    palindrome reads the same from left to right and right to left,
    ignoring spaces, punctuation, and capitalization. For example,
    A Santa lived as a devil at NASA.
    Flo, gin is a sin! I golf.
    A public method isPalindrome is added to the Sentence class.
    Here is the method and its implementation:

    The overloaded isPalindrome method contained in the code is a
    private recursive helper method, also added to the Sentence class.
    You are to write the implementation of this method. It takes a
    “purified” string as a parameter—namely, one that has been stripped
    of blanks and punctuation and is all lowercase letters. It also takes
    as parameters the first and last indexes of the string. It returns true if
    this "purified" string is a palindrome, false otherwise.
    A recursive algorithm for testing if a string is a palindrome is as
    follows:
    If the string has length 0 or 1, it’s a palindrome.
    Remove the first and last letters.
    If those two letters are the same, and the remaining string is a
    palindrome, then the original string is a palindrome. Otherwise
    it’s not.

    Complete the isPalindrome method below:*/
    
    public boolean isPalindrome() {
        String temp = removeBlanks(sentence);
        temp = removePunctuation(temp);
        temp = lowercase(temp);
        return isPalindrome(temp, 0, temp.length() - 1);
    }
    
    private boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        } else {
            if (s.substring(start, start + 1).equals(s.substring(end, end + 1))) {
                return isPalindrome(s.substring(s, start + 1, end - 1));
            }
        }
        return false;
    }
    
    public int getNumWords() { return numWords; }
    public String getSentence() { return sentence; }
    
    private static String removeBlanks(String s) {
        /* implementation not shown */
        return "";
    }
    
    private static String lowercase(String s) {
        /* implementation not shown */
        return "";
    }
    
    private static String removePunctuation(String s) {
        /* implementation not shown */
        return "";
    }  
}
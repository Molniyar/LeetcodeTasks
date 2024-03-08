package Task520_DetectCapital;

import java.util.Objects;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(new DetectCapital().detectCapitalUse("Google"));
    }
    public boolean detectCapitalUse(String word) {
        StringBuilder Word = new StringBuilder(word);
        Word.deleteCharAt(0);
        return Objects.equals(word, word.toUpperCase()) || word.equals(word.toLowerCase()) || (word.charAt(0) + "").equals(word.charAt(0) + "".toUpperCase()) && Word.toString().equals(Word.toString().toLowerCase());
    }
}

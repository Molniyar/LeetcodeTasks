package Task520_DetectCapital;

import java.util.Objects;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(new DetectCapital().detectCapitalUse("AAA"));
    }
    public boolean detectCapitalUse(String word) {
        char firstChar = word.charAt(0);
        boolean isFirstUp = firstChar >= 'A' && firstChar <= 'Z';
        int lowerCaseCount = 0;
        int upperCase = 0;
        for (int i = 0; i < word.length(); i++){
            char wordChar = word.charAt(i);
            if (wordChar >= 'a' && wordChar <= 'z'){
                lowerCaseCount++;
            }
            else if (wordChar >= 'A' && wordChar <= 'Z'){
                upperCase++;
            }
        }
        return upperCase == word.length() ||
                lowerCaseCount == word.length() ||
                isFirstUp && lowerCaseCount == word.length() - 1;
    }
}

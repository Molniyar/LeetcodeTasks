package Page17.Task1768;

import java.util.Arrays;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println(new MergeStringsAlternately().mergeAlternately("", ""));
    }
    public String mergeAlternately(String word1, String word2) {
        char[] result = new char[word1.length()+word2.length()];

        int i = 0;
        int a = 0;
        for (; i < Math.min(word1.length(),word2.length());i++){
            result[a] = word1.charAt(i);
            a++;
            result[a] = word2.charAt(i);
            a++;
        }

        if (word1.length() > word2.length()){
            for (; i < word1.length();i++){
                result[a] = word1.charAt(i);
                a++;
            }
        }
        if (word1.length() < word2.length()){
            for (; i < word2.length();i++){
                result[a] = word2.charAt(i);
                a++;
            }
        }

        return new String(result);
    }
}

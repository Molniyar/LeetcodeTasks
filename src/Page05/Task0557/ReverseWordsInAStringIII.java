package Page05.Task0557;

import java.util.Arrays;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        System.out.println(new ReverseWordsInAStringIII().reverseWords("Let's take LeetCode contest"));
    }
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int startIndex = 0;
        for (int i = 0; i < s.length();i++){
            if (s.charAt(i) == ' '){
                reverse(chars,startIndex,i);
                startIndex = i + 1;
            }
        }
        reverse(chars,startIndex,s.length());
        return new String(chars);
    }
    public static void reverse(char[] chars, int min, int max) {
        int cut = max-1;
        if (chars.length < max){
            cut = chars.length-1;
        }
        for (int i = min, j = cut; i < j; i++, j--){
            char keep = chars[j];
            chars[j] = chars[i];
            chars[i] = keep;
        }
    }
}

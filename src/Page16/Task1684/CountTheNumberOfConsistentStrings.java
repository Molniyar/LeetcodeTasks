package Page16.Task1684;

import java.util.HashSet;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {

    }
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>(allowed.length());
        for (int i = 0; i < allowed.length(); i++){set.add(allowed.charAt(i));}

        int result = 0;
        for (int i = 0; i < words.length; i++){
            int add = 1;
            for (int j = 0; j < words[i].length(); j++){
                if (!set.contains(words[i].charAt(j))){
                    add = 0; break;
                }
            }
            result += add;
        }
        return result;
    }
}

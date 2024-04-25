package Page19.Task1961;

import java.util.Objects;

public class CheckIfStringIsAPrefixOfArray {
    public static void main(String[] args) {
        System.out.println(new CheckIfStringIsAPrefixOfArray().isPrefixString("ccc", new String[]{"c","cc","ccc"}));
    }
    public boolean isPrefixString(String s, String[] words) {
        int x = 0;
        for (int i = 0, j = 0; i < s.length() && j < words.length; i+=words[j].length(), j++){
            if (!s.startsWith(words[j],i)){return false;}
            x+=words[j].length();
        }
        return x == s.length();
    }
}

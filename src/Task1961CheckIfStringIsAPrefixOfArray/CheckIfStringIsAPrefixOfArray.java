package Task1961CheckIfStringIsAPrefixOfArray;

import java.util.Objects;

public class CheckIfStringIsAPrefixOfArray {
    public static void main(String[] args) {
        System.out.println(new CheckIfStringIsAPrefixOfArray().isPrefixString("ccccccccc", new String[]{"c", "cc"}));
    }
    public boolean isPrefixString(String s, String[] words) {
        boolean result = false;
        StringBuilder S = new StringBuilder();
        for (String word : words) {
            S.append(word);
            if (Objects.equals(s, S.toString())) {
                result = true;
            }
        }
        return result;
    }
}

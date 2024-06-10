package Page17.Task1768;

public class MergeStringsAlternately {
    public static void main(String[] args) {

    }
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        for (; i < Math.min(word1.length(),word2.length()); i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        if (word1.length() > word2.length()){result.append(word1.substring(i)); }
        if (word1.length() < word2.length()){result.append(word2.substring(i)); }

        return result.toString();
    }
}

package Task2185_CountWordsWithAGivenString;

public class CountWordsWithAGivenString {
    public static void main(String[] args) {
        System.out.println(new CountWordsWithAGivenString().prefixCount(new String[]{"pay","attention","practice","attend"}, "at"));
    }
    public int prefixCount(String[] words, String pref) {
        int result = 0;
        for (int i = 0; i < words.length; i++){
            if (words[i].startsWith(pref)){
                result++;
            }
        }
        return result;
    }
}

package Page19.Task1967;

public class NumberofStringsThatAppearasSubstringsinWord {
    public static void main(String[] args) {
        System.out.println(new NumberofStringsThatAppearasSubstringsinWord().numOfStrings(new String[]{"a", "abc", "bc", "d"}, "abc"));
    }
    public int numOfStrings(String[] patterns, String word) {
        int result = 0;
        for (int i = 0; i < patterns.length; i++){
            if (word.contains(patterns[i])){
                result++;
            }
        }
        return result;
    }
}

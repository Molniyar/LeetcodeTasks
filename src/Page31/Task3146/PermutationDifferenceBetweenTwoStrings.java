package Page31.Task3146;

public class PermutationDifferenceBetweenTwoStrings {
    public static void main(String[] args) {

    }
    public int findPermutationDifference(String s, String t) {
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            result += Math.abs(i - t.indexOf(s.charAt(i)));
        }
        return result;
    }
}

package Page31.Task3146;

public class PermutationDifferenceBetweenTwoStrings {
    public static void main(String[] args) {

    }
    public int findPermutationDifference(String s, String t) {
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i)-'a'] = i;
        }

        for(int i = 0; i < t.length(); i++){
            int keep = t.charAt(i)-'a';
            arr[keep] = Math.abs(arr[keep]-i);
        }

        int res = 0;
        for(int i = 0; i < 26; i++){
            res += arr[i];
        }

        return res;
    }
}

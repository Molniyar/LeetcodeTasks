package Page03.Task0389;

public class FindTheDifference {
    public static void main(String[] args) {

    }
    public char findTheDifference(String s, String t) {
        byte[] charCountsOfS = new byte[26];
        for (short i = 0; i < s.length(); i++){
            charCountsOfS[s.charAt(i)-'a']++;
        }

        byte[] charCountsOfT = new byte[26];
        for (short i = 0; i < t.length(); i++){
            charCountsOfT[t.charAt(i)-'a']++;
        }

        for (short i = 0; i < charCountsOfS.length; i++){
            if (charCountsOfT[i] > charCountsOfS[i]){
                return (char) (i+'a');
            }
        }
        return '_';
    }
}

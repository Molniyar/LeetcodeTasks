package Page31.Task3110;

public class ScoreOfAString {
    public static void main(String[] args) {
        System.out.println(new ScoreOfAString().scoreOfString("zaz"));
    }
    public int scoreOfString(String s) {
        int result = 0;
        for (int i = 0; i < s.length() - 1;i++){
            result += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return result;
    }
}

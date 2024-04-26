package Page15.Task1528;

public class ShuffleString {
    public static void main(String[] args) {
        System.out.println(new ShuffleString().restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length();i++){
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}

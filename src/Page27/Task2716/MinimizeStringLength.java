package Page27.Task2716;

public class MinimizeStringLength {
    public static void main(String[] args) {
        System.out.println(new MinimizeStringLength().minimizedStringLength("w"));
    }
    public int minimizedStringLength(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++){
            int k = s.charAt(i)-'a';
            result |= 1 << k;
        }

        return Integer.bitCount(result);
    }
}

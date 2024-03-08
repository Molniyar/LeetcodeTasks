package Task344_ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        new ReverseString().reverseString(new char[]{'a', 'b', 'c'});
    }
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--){
            char keepChar = s[j];
            s[j] = s[i];
            s[i] = keepChar;
        }
        System.out.println(s);//debug
    }
}

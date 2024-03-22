package Task125_ValidPalindrome;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("\\\"Degenerate Moslem, a cad!\\\" Eva saved a camel so Meta reneged."));
    }
    public boolean isPalindrome(String s) {
        int length = s.length();
        boolean result = true;
        for (int i = 0, j = s.length() - 1;i < j; i++, j--){
            char startChar = s.charAt(i);
            char endChar = s.charAt(j);
            for (;true;){
                if (! isAlphanumeric(startChar)){
                    i++;
                    if (i >= length){
                        break;
                    }
                    startChar = s.charAt(i);
                }
                else if (! isAlphanumeric(endChar)){
                    j--;
                    if (j < 0){
                        break;
                    }
                    endChar = s.charAt(j);
                }
                else if (startChar >= 'A' && startChar <= 'Z'){
                    startChar = (char)(startChar - ('A' - 'a'));
                }
                else if (endChar >= 'A' && endChar <= 'Z'){
                    endChar = (char)(endChar - ('A' - 'a'));
                }
                else break;
            }
            if (startChar != endChar) {
                result = false;
                break;
            }
            if (i == j){
                break;
            }
        }
        return result;
    }
    public static boolean isAlphanumeric(char c) {
        return c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }
}

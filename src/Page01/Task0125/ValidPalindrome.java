package Page01.Task0125;

public class ValidPalindrome {
    public static void main(String[] args) {

        System.out.println(new ValidPalindrome().isPalindrome(".,"));
    }
    public boolean isPalindrome(String s) {
        int length = s.length();

        boolean result = true;

        for (int i = 0, j = s.length() - 1;i < j; i++, j--){

            char startChar = s.charAt(i);
            char endChar = s.charAt(j);


            for (;true;){
                if (i > j){return true;}
                if (isAlphanumeric(startChar)){
                    break;
                }
                i++;
                if (i >= length){
                    break;
                }
                startChar = s.charAt(i);
            }

            for (;true;){
                if (i > j){return true;}
                if (isAlphanumeric(endChar)){
                    break;
                }
                j--;
                if (j < 0){
                    break;
                }
                endChar = s.charAt(j);

            }
            if (startChar >= 'A' && startChar <= 'Z'){
                startChar = (char)(startChar - ('A' - 'a'));
            }
            if (endChar >= 'A' && endChar <= 'Z'){
                endChar = (char)(endChar - ('A' - 'a'));
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

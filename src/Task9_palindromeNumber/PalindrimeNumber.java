package Task9_palindromeNumber;

public class PalindrimeNumber {
    public static void main(String[] args) {
        int test  = 2345;
        int test1 = 121;
        int test2 = -191;
        int test3 = -200;
        int test4 = 12766721;

        System.out.println(new PalindrimeNumber().isPalindrome(test2));
    }
    public boolean isPalindrome(int x) {
        String xLine = x + "";
        String eniLx = "";//xLine, только наоборот(записывается в цикле ниже)
        for (int i = xLine.length() - 1; i >= 0; i--){
            eniLx = eniLx + xLine.charAt(i);
        }
        return xLine.equals(eniLx);
    }
}

package Task9_palindromeNumber;

public class PalindrimeNumber {
    public static void main(String[] args) {
        int test  = 2345;
        int test1 = 121;
        int test2 = -191;
        int test3 = -200;
        int test4 = 12766721;

        System.out.println(new PalindrimeNumber().isPalindrome(test));
    }
    public boolean isPalindrome(int x) {
        if (x < 0){
        return false;
        }
        int reverse = 0;
        for (int i = x, j = 1; i != 0; i /= 10, j *= 10){
            //int digit = (i % 10);
            reverse *= 10;
            reverse += i % 10;
        }
        return x == reverse;
    }
}

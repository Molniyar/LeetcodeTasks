package Page26.Task2697;

public class LexicographicallySmallestPalindrome {
    public static void main(String[] args) {

    }
    public String makeSmallestPalindrome(String s) {
        char[] res = s.toCharArray();
        for (int i = 0; i < s.length()/2; i++){
            char sec = res[i];
            int keepIndex = s.length()-1-i;

            if (res[keepIndex] < sec){
                res[i] = res[keepIndex];
            }
            if (res[keepIndex] > sec){
                res[keepIndex] = sec;
            }
        }
        return new String(res);
    }
}

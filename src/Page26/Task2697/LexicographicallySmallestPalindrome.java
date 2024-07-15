package Page26.Task2697;

public class LexicographicallySmallestPalindrome {
    public static void main(String[] args) {

    }
    public String makeSmallestPalindrome(String s) {
        char[] res = s.toCharArray();

        int halfLength = s.length()/2;
        for (int i = 0; i < halfLength; i++){
            char sec = res[i];

            int keepIndex = s.length()-1-i;
            char keep = res[keepIndex];

            if (keep < sec){
                res[i] = keep;
            }
            else if (keep > sec){
                res[keepIndex] = sec;
            }
        }
        return new String(res);
    }
}

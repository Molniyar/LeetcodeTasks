package Page18.Task1816;

public class TruncateSentence {
    public static void main(String[] args) {
        System.out.println(new TruncateSentence().truncateSentence("What is the solution to this problem", 2));
    }
    public String truncateSentence(String s, int k) {
        int endIndex = 0;
        for (; endIndex < s.length() && k > 0; endIndex++){
            if (s.charAt(endIndex) == ' '){
                k--;
            }
        }
        return s.substring(0, endIndex).trim();
    }
}

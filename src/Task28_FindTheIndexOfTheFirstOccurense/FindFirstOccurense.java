package Task28_FindTheIndexOfTheFirstOccurense;

public class FindFirstOccurense {
    public static void main(String[] args) {
        String haystack  = "beetroot";
        String haystack1 = "house";
        String haystack2 = "";

        String haystackProblem = "mississippi";

        String needle    = "root";
        String needle1   = "horn";
        String needle2   = "bee";
        String needleProblem = "issip";
        System.out.println(new FindFirstOccurense().strStr(haystackProblem, needleProblem));

    }
    public int strStr(String haystack, String needle) {
        int i2 = 0;
        for (int i = 0; i < haystack.length();i++){
            if (haystack.charAt(i) == needle.charAt(i2)){
                i2++;
                if (i2 == needle.length()){
                    return i - (i2 - 1);
                }
            }
            else {
                i = i - i2;//можно оптимизировать потому-что в некоторых случаях эта строка не нужна.
                i2 = 0;

            }
        }
        return -1;
    }
}

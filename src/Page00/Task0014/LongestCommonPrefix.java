package Page00.Task0014;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] test  = {"have","how","ham","house"};//h
        String[] test1 = {"ear","eat","east"};//ea
        String[] test2 = {"have","has","ham","hack"};//ha
        String[] test3 = {"reset","reverse","real","renium","rest","restart","remake"};//re
        String[] problem  = {"a"};
        String[] problem1 = {"flower","flower","flower","flower"};
        String[] problem2 = {"flower","flow","flight"};

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(problem2));
    }
    public String longestCommonPrefix(String[] strs) {
        int maxLength = 0;
        int shortestLength = strs[0].length();
        for (int i = 0; i < strs.length; i++){
            if (strs[i].length() < shortestLength){
                shortestLength = strs[i].length();
            }
        }
        int char_ = 0;
        int index = 0;
        for (;char_ < shortestLength; char_++) {
            int equalsCharsCount = 0;
            char compareChar = strs[0].charAt(char_);
            for (; index < strs.length; index++) {
                if (compareChar == strs[index].charAt(char_)){
                    equalsCharsCount++;
                }
                else break;
            }
            if (equalsCharsCount == strs.length){
                maxLength++;
            }
            else break;
            index = 0;
        }
        return strs[0].substring(0, maxLength);
    }
}

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
        String[] problem3 = {"","b"};
        String[] problem4 = {"aaa","aa","aaa"};
        String[] problem5 = {"c","acc","ccc"};

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(problem1));
    }
    public String longestCommonPrefix(String[] strs) {
        int end = strs[0].length();
        int max = end;

        for (int i = 0; i < strs.length; i++){
            int count = 0;
            for (int j = 0; j < strs[i].length() && j < strs[0].length(); j++){
                if (strs[i].charAt(j) == strs[0].charAt(j)){
                    count++;
                }
                else break;
            }
            end = Math.clamp(count,0,max);
            max = end;
        }
        return strs[0].substring(0,end);
    }
}

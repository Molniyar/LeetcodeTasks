package Task771_JewelsAndStones;

import java.util.HashSet;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels0 = "sr";
        String stones0 = "String";

        String jewels1 = "aA";
        String stones1 = "aAAbbbb";



        System.out.println(new JewelsAndStones().numJewelsInStones(jewels1, stones1));
    }
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < jewels.length(); i++){
            for (int j = 0; j < stones.length(); j++){
                if (jewels.charAt(i) == stones.charAt(j)){
                    result++;
                }
            }
        }
        return result;
    }
}
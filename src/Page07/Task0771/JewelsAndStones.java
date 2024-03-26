package Page07.Task0771;

import java.util.BitSet;

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
        BitSet bitSet = new BitSet(122);
        for (int i = 0; i < jewels.length();i++){
            bitSet.set(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++){
            if (bitSet.get(stones.charAt(i))){
                result++;
            }
        }
        return result;
    }
}
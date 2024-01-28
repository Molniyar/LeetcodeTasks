package Task191_numberOf1Bits;

import Task58_LengthOfLastWord.LengthOfLastWord;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int test1 = 64;//4
        int test2 = 5;//3
        int test3 = -3;//2
        //System.out.println(new NumberOf1Bits().hammingWeight(test1));
        //System.out.println(new NumberOf1Bits().hammingWeight(test2));
        System.out.println(new NumberOf1Bits().hammingWeight(test3));
    }
    public int hammingWeight(int n) {
        int count = 0;

        for (;n != 0;n >>>= 1) {
            count += n &1;
        }
        return count;
    }
}

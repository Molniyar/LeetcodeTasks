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
        String y = "";
        String bits = n + "";
        if (n < 0){
            y = y + 1;
            n &= 0x7fffffff;
        }
        while (n != 0) {
            y = y + (n % 2);
            n = n / 2;
        }


        int bitCount = 0;

        for (int i = 0; i < y.length(); i++){
            if (y.charAt(i) == '1'){
                bitCount++;
            }
        }
        return bitCount;
    }
}

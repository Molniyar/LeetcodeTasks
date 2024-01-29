package Task66_PlusOne;

import Task191_numberOf1Bits.NumberOf1Bits;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] test = {1, 3, 9, 3};
        int[] test1 = {9, 9, 9};
        int[] test2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(test)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(test1)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(test2)));
    }
    public int[] plusOne(int[] digits) {
        int needsToBeLonger = 0;
        for (int i = 0; i < digits.length; i++){
            if (digits[i] == 9){
                needsToBeLonger++;
            }
        }
        String sDig = "";
        for (int i = 0; i < digits.length; i++){
            sDig = sDig + digits[i];
        }
        int dig = Integer.parseInt(sDig);
        dig++;

        String sResult = dig + "";
        char[] preResult = sResult.toCharArray();
        int[] result;

        if (needsToBeLonger == digits.length){
            result = new int[digits.length + 1];
        }
        else result = new int[digits.length];

        for (int i = 0; i < preResult.length; i++){
            result[i] = preResult[i];
            result[i] = result[i] - 48;
        }
        return result;
    }
}

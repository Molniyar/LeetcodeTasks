package Task66_PlusOne;

import Task191_numberOf1Bits.NumberOf1Bits;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] test = {1, 3, 9, 3};
        int[] test1 = {9, 9, 9};
        int[] test2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] test3 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] test4 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(test)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(test1)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(test2)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(test3)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(test4)));
    }
    public int[] plusOne(int[] digits) {
        int needToAdd = 1;
        for (int i = 0; i < digits.length; i++){
            if (digits[i] != 9){
                needToAdd = 0;
            }
        }

        int[] result = new int[digits.length + needToAdd];

        for (int i = 0; i <digits.length; i++){
            result[i + needToAdd] = digits[i];
        }

        for (int i = result.length - 1; i >= 0; i--){
            if (result[i] < 9){
                result[i]++;
                break;
            }
            else result[i] = 0;
        }
        return result;
    }
}

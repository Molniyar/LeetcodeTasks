package Page00.Task0066;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] test = {1, 3, 9, 3};
        int[] test1 = {9, 9, 9};
        int[] test2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] test3 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] test4 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] problem0 = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(new PlusOne().plusOne(test)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(test1)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(test2)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(test3)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(test4)));
        System.out.println(Arrays.toString(new PlusOne().plusOne(problem0)));
    }
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > 0; i--){
            if (digits[i] > 9){
                digits[i] = 0;
                digits[i - 1]++;
            }
        }
        if (digits[0] != 10) {
            return digits;
        }
        int[] result = new int[digits.length + 1];
        System.arraycopy(digits, 0, result, 1, digits.length);
        result[0] = 1;
        result[1] = 0;
        return result;
    }
}

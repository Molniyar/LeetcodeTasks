package Task2535_DifferenceBetweenElementAndDigit;

import java.util.Arrays;

public class DifferenceBetweenElementAndDigit {
    public static void main(String[] args) {
        System.out.println(new DifferenceBetweenElementAndDigit().differenceOfSum(new int[]{1, 15, 6, 3}));
    }
    public int differenceOfSum(int[] nums) {
        StringBuilder Snums = new StringBuilder();
        int element = 0;
        for (int i = 0; i < nums.length; i++){
            element = element + nums[i];
            Snums.append(nums[i]);
        }
        int digit = 0;
        for (int i = 0; i < Snums.length(); i++){
            digit = digit + (Snums.charAt(i) - 48);
            System.out.println(Snums.charAt(i));
        }
        return element - digit;
    }
}

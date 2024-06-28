package Page02.Task0268;

import java.util.BitSet;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.println(new MissingNumber().missingNumber(new int[]{0, 1, 2}));
    }
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = 0;
        for (int i = 0; i < length; i++){
            sum += nums[i];
        }
        return ((length + 1) * (length) / 2) - sum;
    }
}

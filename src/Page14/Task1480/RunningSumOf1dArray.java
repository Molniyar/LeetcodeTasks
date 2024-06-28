package Page14.Task1480;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RunningSumOf1dArray().runningSum(new int[]{1, 1, 1, 1})));
    }
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            result[result.length - 1] += nums[i];
        }
        for (int i = nums.length - 2; i >= 0; i--){
            result[i] = result[i + 1] - nums[i + 1];
        }
        return result;
    }
}

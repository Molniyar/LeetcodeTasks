package Page25.Task2574;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeftAndRightSumDifferences().leftRightDifference(new int[]{10, 4, 8, 3})));
    }
    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];

        int keepLeftNum = 0;
        int keepRightNum = 0;

        for (int i = 0; i < nums.length; i++){
            //System.out.println(nums[i]);
            result[i] = keepLeftNum;
            keepLeftNum += nums[i];
        }
        for (int i = nums.length-1; i >= 0; i--){
            result[i] = Math.abs(result[i] - keepRightNum);
            keepRightNum += nums[i];
        }
        return result;
    }
}

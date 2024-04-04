package Page25.Task2574;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeftAndRightSumDifferences().leftRightDifference(new int[]{10, 4, 8, 3})));
    }
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int keepLeftNum = 0;

        int[] rightSum = new int[nums.length];
        int keepRightNum = 0;

        for (int i = 0; i < nums.length; i++){
            leftSum[i] = keepLeftNum;
            keepLeftNum += nums[i];
            //System.out.println(nums[i]);
            rightSum[nums.length - 1 - i] = keepRightNum;
            keepRightNum += nums[nums.length - 1 - i];
            //System.out.println(nums[nums.length - 1 - i]);
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
            //System.out.println(leftSum[i] - rightSum[i]);
        }
        return result;
    }
}

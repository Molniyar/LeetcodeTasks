package Page25.Task2574;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeftAndRightSumDifferences().leftRightDifference(new int[]{10, 4, 8, 3})));
    }
    public int[] leftRightDifference(int[] nums) {
        int keepLeftNum = 0;

        int RkeepRightNum = 0;
        for (int i = 0; i < nums.length; i++){
            RkeepRightNum+=nums[i];
        }

        for (int i = 0, j = nums.length-1; i < nums.length; i++, j--){
            int keep = nums[i];
            nums[i] = keepLeftNum;
            keepLeftNum += keep;

            RkeepRightNum -= keep;
            nums[i] = Math.abs(nums[i] - RkeepRightNum);
        }
        return nums;
    }
}

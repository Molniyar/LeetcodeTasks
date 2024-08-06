package Page31.Task3194;

import java.util.Arrays;

public class MinimumAverageOfSmallestAndLargestElements {
    public static void main(String[] args) {

    }
    public double minimumAverage(int[] nums) {
        int l = nums.length;

        Arrays.sort(nums);

        double res = (nums[0] + nums[l - 1]) / 2.0;

        for (int i = 1; i < l / 2; i++) {
            double num = (nums[i] + nums[l - 1 - i]) / 2.0;

            if (num < res) {
                res = num;
            }
        }

        return res;
    }
}

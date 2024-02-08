package Task1920_BuildArrayFromPermutation;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] test  = {0, 2, 1};// 0 1 2
        int[] test1 = {2, 4, 3, 0, 1};//3 1 0 2 4

        System.out.println(Arrays.toString(new BuildArrayFromPermutation().buildArray(test1)));

    }
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

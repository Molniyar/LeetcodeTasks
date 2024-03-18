package Task2974_MinimumNumberGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNumberGame {
    public static void main(String[] args) {
        int[] test = {5,4,2,3};
        int[] test1 = {1,5,8,3,5,2,2,7};
        System.out.println(Arrays.toString(new MinimumNumberGame().numberGame(test1)));
    }
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2){
            int keep = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = keep;
        }
        return nums;
    }
}

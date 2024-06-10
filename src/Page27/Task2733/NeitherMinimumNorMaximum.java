package Page27.Task2733;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class NeitherMinimumNorMaximum {
    public static void main(String[] args) {
        System.out.println(new NeitherMinimumNorMaximum().findNonMinOrMax(new int[] {1,4,2,3}));
    }
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3){return -1;}

        Arrays.sort(nums);

        for (int i = 1; i < nums.length-1; i++){
            if (nums[i] > nums[0]){
                return nums[i];
            }
        }
        return -1;
    }
}

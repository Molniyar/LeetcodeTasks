package Page27.Task2733;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class NeitherMinimumNorMaximum {
    public static void main(String[] args) {
        System.out.println(new NeitherMinimumNorMaximum().findNonMinOrMax(new int[] {4,2,1,3}));
    }
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3){return -1;}

        int num1 = nums[0];
        int num2 = nums[1];
        int num3 = nums[2];

        if (num1 > num2 == num1 < num3){return num1;}
        if (num2 > num1 == num2 < num3){return num2;}
        if (num3 > num2 == num3 < num1){return num3;}

        return -1;
    }
}

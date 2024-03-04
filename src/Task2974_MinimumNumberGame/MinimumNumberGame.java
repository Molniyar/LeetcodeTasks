package Task2974_MinimumNumberGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNumberGame {
    public static void main(String[] args) {
        int[] test = {5,4,2,3};
        System.out.println(Arrays.toString(new MinimumNumberGame().numberGame(test)));
    }
    public int[] numberGame(int[] nums) {
        int[] result = new int[nums.length];
        for (int x = 0; x < nums.length; x+=2) {
            int alice = 100;
            int indexA = 0;
            for (int i = 0; i < nums.length; i++) {
                if (alice > nums[i]) {
                    alice = nums[i];
                    indexA = i;
                }
            }
            nums[indexA] = 101;
            int bob = 100;
            int indexB = 0;
            for (int i = 0; i < nums.length; i++) {
                if (bob > nums[i]) {
                    bob = nums[i];
                    indexB = i;
                }
            }
            nums[indexB] = 101;
            result[x] = bob;
            result[x + 1] = alice;
        }
        return result;
    }
}

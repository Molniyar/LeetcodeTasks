package Task1470_ShuffleTheArray;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ShuffleTheArray().shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++){
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[i + n];
        }
        return result;
    }
}

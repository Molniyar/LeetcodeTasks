package Page19.Task1929;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 4;
        array[2] = 3;
        System.out.println(Arrays.toString(new ConcatenationOfArray().getConcatenation(array)));
    }
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(nums, 0, result, nums.length, nums.length);
        return result;
    }
}

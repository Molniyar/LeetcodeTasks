package Task1929_ConcatenationOfArray;

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
        int index = nums.length * 2;

        int[] result = new int[index];

        for (int i = 0; i < nums.length; i++){
            result[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++){
            result[i + nums.length] = nums[i];
        }
        return result;
    }
}

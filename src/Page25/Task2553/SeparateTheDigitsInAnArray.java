package Page25.Task2553;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateTheDigitsInAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SeparateTheDigitsInAnArray().separateDigits(new int[]{13, 25, 83, 77})));
    }
    public int[] separateDigits(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = nums[i]; j != 0; j /= 10){
                length++;
            }
        }

        int[] result = new int[length];

        for (int i = 0, i2 = 0; i < nums.length; i++){
            int k  = i2;

            for (int j = nums[i]; j != 0; j /= 10, i2++){
                result[i2] = (j % 10);
            }

            reverse(result, k, i2-1);
        }

        return result;
    }
    public static void reverse(int[] arr, int start, int end){
        for (int i = start, j = end; i < j; i++, j--){
            int keep = arr[j];
            arr[j] = arr[i];
            arr[i] = keep;
        }
    }
}

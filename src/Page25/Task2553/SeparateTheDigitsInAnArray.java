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

        byte[] lengths = new byte[nums.length];
        for (int i = 0; i < nums.length; i++){
            int l = 0;
            for (int j = nums[i]; j != 0; j /= 10){
                length++;
                l++;
            }
            lengths[i] = (byte) l;
        }

        int[] result = new int[length];

        for (int i = 0, i2 = 0; i < nums.length; i++){
            int k  = i2;
            int K = i2+lengths[i]-1;

            int l = 0;

            for (int j = nums[i]; j != 0; j /= 10,K--){
                result[K] = (j % 10);
            }
            i2+=lengths[i];
        }

        return result;
    }
}

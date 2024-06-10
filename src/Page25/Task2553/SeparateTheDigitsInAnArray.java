package Page25.Task2553;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateTheDigitsInAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SeparateTheDigitsInAnArray().separateDigits(new int[]{13, 25, 83, 77})));
    }
    public int[] separateDigits(int[] nums) {
        List<Integer> preResult = new ArrayList<>();

        int start = 0;
        for (int i = 0; i < nums.length; i++){
            List<Integer> keep = new ArrayList<>();
            for (int j = nums[i]; j != 0; j /= 10){
                int digit = (j % 10);
                keep.add(digit);
            }
            int j = 0;
            for (; j < keep.size(); j++){
                preResult.add(start, keep.get(j));
            }
            start+= j;
        }

        int[] result = new int[preResult.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = preResult.get(i);
        }

        return result;
    }
}

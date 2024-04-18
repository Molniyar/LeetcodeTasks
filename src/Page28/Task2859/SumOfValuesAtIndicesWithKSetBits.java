package Page28.Task2859;


import java.util.ArrayList;
import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(new SumOfValuesAtIndicesWithKSetBits().sumIndicesWithKSetBits(nums, 1));
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.size(); i++){
            if (Integer.bitCount(i) == k){
                result += nums.get(i);
            }
        }
        return result;
    }
}

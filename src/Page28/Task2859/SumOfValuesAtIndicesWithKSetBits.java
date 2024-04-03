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
            if (shouldBeAdded(i, k)){
                System.out.println("добавляется число " + nums.get(i));
                result += nums.get(i);
            }
        }
        return result;
    }
    public static boolean shouldBeAdded(int num, int k) {
        for (int i = num; i != 0; i = i >> 1){
            //if (i % 2 == 1){k--;}
            if (i >> num - i == 0){k--;}
        }
        return k == 0;
    }
}

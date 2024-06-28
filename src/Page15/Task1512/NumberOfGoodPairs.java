package Page15.Task1512;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] test0 = {1,2,3,1,1,3};
        int[] test1 = {1,1,1};
        int[] test2 = {3,3};
        int[] test3 = {1,1,1,2,3,3};
        int[] test4 = {};

        int[] problem0 = {};

        System.out.println(new NumberOfGoodPairs().numIdenticalPairs(test2));
    }
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], 1);
            }
            else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            int x = entry.getValue();
            result += x * (x - 1) / 2;
        }
        return result;
    }
}

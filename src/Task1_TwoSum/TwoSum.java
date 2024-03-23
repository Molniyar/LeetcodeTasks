package Task1_TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums  = {1, 2, 4, 3};
        int[] nums1 = {3, 3, 3, 3};
        int[] nums2 = {1, 5, 3};
        int[] nums3 = {3, 1, 3};
        int[] nums5 = {-1,-2,-3,-4,-5};

        int target  = 3;
        int target1 = 8;
        int target2 = 6;
        int target5 = -8;


        System.out.println(Arrays.toString(new TwoSum().twoSum(nums1, target1)));
    }
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (hashMap.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = hashMap.get(target - nums[i]);
                break;
            }
            hashMap.put(nums[i], i);
        }
        return result;
    }
}

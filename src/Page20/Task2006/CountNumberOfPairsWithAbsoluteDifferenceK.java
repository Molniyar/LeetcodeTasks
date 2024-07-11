package Page20.Task2006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        System.out.println(new CountNumberOfPairsWithAbsoluteDifferenceK().countKDifference(new int[]{1,2,2,1}, 1));
    }
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        int res = 0;

        for (int i = 0; i< nums.length; i++){
            if(map.containsKey(nums[i] - k)){
                res += map.get(nums[i] - k);
            }
            if(map.containsKey(nums[i] + k)){
                res += map.get(nums[i] + k);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        return res;
    }
}

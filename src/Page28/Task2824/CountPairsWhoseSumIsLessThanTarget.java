package Page28.Task2824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        System.out.println(new CountPairsWhoseSumIsLessThanTarget().countPairs(nums, 2));
    }
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);

        int count = 0;

        int left = 0;
        int right = nums.size()-1;

        while (left < right){
            if (nums.get(left) + nums.get(right) < target){
                count += right-left;
                left++;
            }
            else {
                right--;
            }
        }

        return count;
    }
}

package Page28.Task2824;

import java.util.ArrayList;
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
        int result = 0;
        for (int i = 0; i < nums.size(); i++){
            for (int j = i +1; j < nums.size(); j++){
                if (nums.get(i) + nums.get(j) < target){result++;}
            }
        }
        return result;
    }
}

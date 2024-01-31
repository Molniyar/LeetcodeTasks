package Task136_singleNumber;

import java.util.HashSet;

public class FindSingleNumber {
    public static void main(String[] args) {
        int[] test  = {1, 3, 2, 1, 2};
        int[] test1 = {1, 2, 1};
        int[] test2 = {9, 9, 9};
        System.out.println(new FindSingleNumber().singleNumber(test2));
    }
    public int singleNumber(int[] nums) {
        int[] resultArray = new int[nums.length];
        HashSet<Integer>preResult = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++){
            boolean preResultLength = preResult.contains(nums[i]);
            if (preResultLength){
                preResult.remove(nums[i]);
            }
            else preResult.add(nums[i]);
        }
        int result = 0;
        for (int i : preResult)
            result = i;

        return result;
    }
}

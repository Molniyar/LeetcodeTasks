package Task169_MajorityElement;

import com.sun.jdi.IntegerValue;

import java.util.HashSet;

public class MajorityElement {
    public static void main(String[] args) {
        int[] test  = {1, 2, 1, 5, 5, 1, 1, 1, 1, 2, 1};
        int[] test1 = {3, 2, 3};
        int[] test2 = {3, 2, 3, 2, 3, 4, 3};
        int[] test3 = {3, 2, 3, 2, 3, 4, 3, 2, 3, 7, 3, 9, 3, 5, 3, 6, 3, 4, 3, 7, 3, 6, 3, 4, 3, 3, 2, 3, 1, 3};
        int[] failed = {-1, 100, 2, 100, 100, 4, 100};

        System.out.println(new MajorityElement().majorityElement(failed));
    }
    public int majorityElement(int[] nums) {
        int halfOfLength = nums.length / 2;
        int numberCount = 0;
        int result = 0;
        int x = 0;

        HashSet<Integer> variants = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            variants.add(nums[i]);
        }
        for (Integer value: variants){
            for (int j = 0; j < nums.length; j++){

                if (value == nums[j]){
                    numberCount++;
                }
            }
            if (numberCount > halfOfLength){
                result = value;
                break;
            }
            else numberCount = 0;
        }
        return result;
    }
}

package Page02.Task0217;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3}));
    }
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (hashSet.contains(nums[i])){
                return true;
            }
            else hashSet.add(nums[i]);
        }
        return false;
    }
}

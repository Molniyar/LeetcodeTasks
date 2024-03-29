package Page02.Task0268;

import java.util.BitSet;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
    public int missingNumber(int[] nums) {
        BitSet bitSet = new BitSet(nums.length + 1);
        for (int num : nums) {
            bitSet.set(num);
        }
        for (int i = 0; i <= nums.length; i++){
            if (!bitSet.get(i)){
                return i;
            }
        }
        return -1;
    }
}

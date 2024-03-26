package Page01.Task0136;

public class FindSingleNumber {
    public static void main(String[] args) {
        int[] test  = {1, 3, 2, 1, 2};
        int[] test1 = {1, 2, 1};
        int[] test2 = {9, 9, 9};
        System.out.println(new FindSingleNumber().singleNumber(test2));
    }
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }
}

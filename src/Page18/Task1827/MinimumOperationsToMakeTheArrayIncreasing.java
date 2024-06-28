package Page18.Task1827;

public class MinimumOperationsToMakeTheArrayIncreasing {
    public static void main(String[] args) {

    }
    public int minOperations(int[] nums) {
        int count = 0;
        if (nums.length < 2){
            return count;
        }
        for (int i = 1;i < nums.length;i++){
            if (nums[i] <= nums[i-1]){
                count += nums[i-1]+1-nums[i];
                nums[i] = nums[i-1]+1;
            }
        }
        return count;
    }
}

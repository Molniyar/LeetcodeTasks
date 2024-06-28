package Page18.Task1863;

public class SumOfAllSubsetXORTotals {
    public static void main(String[] args) {

    }
    public int subsetXORSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int result = 1 << (nums.length - 1);

        int mult = 0;
        for (int i = 0; i < nums.length; i++){
            mult |= nums[i];
        }
        result *= mult;
        return result;
    }
}

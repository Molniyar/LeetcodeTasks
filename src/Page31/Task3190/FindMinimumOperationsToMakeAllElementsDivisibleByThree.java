package Page31.Task3190;

public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    public static void main(String[] args) {

    }
    public int minimumOperations(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]%3 == 0){
                continue;
            }
            res++;
        }

        return res;
    }
}

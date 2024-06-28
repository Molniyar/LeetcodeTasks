package Page30.Task3010;

public class DivideAnArrayIntoSubarraysWithMinimumCostI {
    public static void main(String[] args) {

    }
    public int minimumCost(int[] nums) {
        int m1 = 100;
        int m2 = 100;
        for (int i = 1; i < nums.length; i++){
            int n = nums[i];
            if (n < m1){
                m2 = m1;
                m1 = n;
            }
            else if (n < m2){
                m2 = n;
            }
        }
        return nums[0] + m1 + m2;
    }
}

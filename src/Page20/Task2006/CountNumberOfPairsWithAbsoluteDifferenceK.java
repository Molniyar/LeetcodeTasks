package Page20.Task2006;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        System.out.println(new CountNumberOfPairsWithAbsoluteDifferenceK().countKDifference(new int[]{1,2,2,1}, 1));
    }
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            int keep = nums[i];
            for (int j = i+1; j < nums.length; j++){
                if (keep + k == nums[j] || keep - k == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}

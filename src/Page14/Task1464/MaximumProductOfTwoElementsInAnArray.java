package Page14.Task1464;

public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        System.out.println(new MaximumProductOfTwoElementsInAnArray().maxProduct(new int[]{10, 9, 8, 101}));
    }
    public int maxProduct(int[] nums) {
        int maxNum = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > maxNum){
                index = i;
                maxNum = nums[i];
            }
        }
        nums[index] = -1;
        int maxNum2 = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > maxNum2){
                maxNum2 = nums[i];
            }
        }
        return (maxNum - 1) * (maxNum2 - 1);
    }
}

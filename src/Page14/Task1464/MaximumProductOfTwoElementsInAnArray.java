package Page14.Task1464;

public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        System.out.println(new MaximumProductOfTwoElementsInAnArray().maxProduct(new int[]{10, 9, 8, 101}));
    }
    public int maxProduct(int[] nums) {
        int maxNum = 0;
        int maxNum2 = 0;
        for (int num : nums) {
            if (num > maxNum) {
                maxNum2 = maxNum;
                maxNum = num;
            } else if (num > maxNum2) {
                maxNum2 = num;
            }
        }
        return (maxNum - 1) * (maxNum2 - 1);
    }
}

package Page19.Task1913;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        System.out.println(new MaximumProductDifferenceBetweenTwoPairs().maxProductDifference(new int[]{5,9,4,6}));
    }
    public int maxProductDifference(int[] nums) {
        int keep1 = 0;
        int keep2 = 0;
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max1){
                max2 = max1;
                keep2 = keep1;
                max1 = nums[i];
                keep1 = i;
            }
            else if (nums[i] > max2){
                max2 = nums[i];
                keep2 = i;
            }
        }
        nums[keep1] = 100000;
        nums[keep2] = 100000;

        int min1 = 100000;
        int min2 = 100000;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < min1){
                min2 = min1;
                min1 = nums[i];
            }
            else if (nums[i] < min2){
                min2 = nums[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(min1);
        System.out.println(min2);
        return (max1 * max2) - (min1 * min2);
    }
}

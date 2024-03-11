package Task2605_SmallestNumberFromTwoArrays;

public class SmallestNumberFromTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 3};
        int[] nums2 = {5, 7};
        int[] nums1_1 = {3, 5, 2, 6};
        int[] nums2_1 = {3, 1, 7};
        System.out.println(new SmallestNumberFromTwoArrays().minNumber(nums1_1, nums2_1));
    }
    public int minNumber(int[] nums1, int[] nums2) {
        int result = 100;
        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                int num = 0;
                if (nums1[i] < nums2[j]){
                    num = (nums1[i] * 10) + nums2[j];
                }
                else if (nums1[i] > nums2[j]){
                    num = (nums2[j] * 10) + nums1[i];
                }
                else num = nums1[i];
                result = Math.min(result, num);
            }
        }
        return result;
    }
}

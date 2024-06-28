package Page26.Task2605;

import java.util.HashMap;
import java.util.HashSet;

public class SmallestNumberFromTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 3};
        int[] nums2 = {5, 7};
        int[] nums1_1 = {3, 5, 2, 6};
        int[] nums2_1 = {3, 1, 7};
        int[] nums1_2 = {1,2,3};
        int[] nums2_2 = {3,2,1};
        System.out.println(new SmallestNumberFromTwoArrays().minNumber(nums1, nums2));
    }
    public int minNumber(int[] nums1, int[] nums2) {
        int result = 100;
        int set = 0;
        for (int j : nums2) {
            set |= 1 << j;
        }
        for (int num : nums1) {
            if ((set & (1 << num)) != 0 && result > num) {
                result = num;
            }
        }
        if (result != 100){
            return result;
        }
        int min1 = 10;
        for (int j : nums1) {
            min1 = Math.min(min1, j);
        }
        int min2 = 10;
        for (int j : nums2) {
            min2 = Math.min(min2, j);
        }
        return (Math.min(min1,min2) * 10) + Math.max(min1,min2);
    }
}

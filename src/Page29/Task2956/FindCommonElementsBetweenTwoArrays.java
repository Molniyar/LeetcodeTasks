package Page29.Task2956;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {

    }
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int j : nums1) {
            set1.add(j);
        }

        for (int j : nums2) {
            set2.add(j);
        }

        int count1 = 0;
        int count2 = 0;
        for (int j : nums1) {
            if (set2.contains(j)) {
                count1++;
            }
        }
        for (int j : nums2) {
            if (set1.contains(j)) {
                count2++;
            }
        }

        return new int[]{count1, count2};
    }
}

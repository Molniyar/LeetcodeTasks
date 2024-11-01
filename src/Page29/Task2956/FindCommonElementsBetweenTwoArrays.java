package Page29.Task2956;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {

    }
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        BitSet set1 = new BitSet();
        BitSet set2 = new BitSet();

        for (int j : nums1) {
            set1.set(j,true);
        }

        for (int j : nums2) {
            set2.set(j,true);
        }

        int count1 = 0;
        int count2 = 0;
        for (int j : nums1) {
            if (set2.get(j)) {
                count1++;
            }
        }
        for (int j : nums2) {
            if (set1.get(j)) {
                count2++;
            }
        }

        return new int[]{count1, count2};
    }
}

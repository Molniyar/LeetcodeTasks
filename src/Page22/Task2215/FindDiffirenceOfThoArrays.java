package Page22.Task2215;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class FindDiffirenceOfThoArrays {
    public static void main(String[] args) {

    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>(2);

        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        BitSet set1 = new BitSet(2001);
        for (int i = 0; i < nums1.length; i++) {
            set1.set(nums1[i]+1000);
        }

        BitSet set2 = new BitSet(2001);
        for (int i = 0; i < nums2.length; i++){
            set2.set(nums2[i]+1000);
        }

        for (int i = 0;i < nums1.length; i++){
            int keep = nums1[i];

            if (!set2.get(keep+1000) && !result.get(0).contains(keep)){
                result.get(0).add(keep);
            }
        }

        for (int i = 0;i < nums2.length; i++){
            int keep = nums2[i];


            if (!set1.get(keep + 1000) && !result.get(1).contains(keep)){
                result.get(1).add(keep);
            }
        }
        return result;
    }
}

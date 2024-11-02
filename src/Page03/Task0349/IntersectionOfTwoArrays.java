package Page03.Task0349;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        BitSet r = new BitSet();

        BitSet set = new BitSet();
        for (int i = 0; i < nums1.length; i++){
            set.set(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++){
            if (set.get(nums2[i])){
                r.set(nums2[i]);
            }
        }

        return r.stream().toArray();
    }
}

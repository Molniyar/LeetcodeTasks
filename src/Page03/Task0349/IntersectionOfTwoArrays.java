package Page03.Task0349;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> r = new HashSet<>();

        BitSet set = new BitSet();
        for (int i = 0; i < nums1.length; i++){
            set.set(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++){
            if (set.get(nums2[i])){
                r.add(nums2[i]);
            }
        }

        int[] result = new int[r.size()];

        int i = 0;
        for (int num : r){
            result[i] = num;
            i++;
        }

        return result;
    }
}

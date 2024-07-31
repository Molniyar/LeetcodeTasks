package Page20.Task2032;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class TwoOutOfThree {
    public static void main(String[] args) {

    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res = new ArrayList<>();

        BitSet set1 = new BitSet(101);
        for (int i = 0; i < nums1.length; i++){set1.set(nums1[i]);}
        BitSet set2 = new BitSet(101);
        for (int i = 0; i < nums2.length; i++){set2.set(nums2[i]);}
        BitSet set3 = new BitSet(101);
        for (int i = 0; i < nums3.length; i++){set3.set(nums3[i]);}


        for (int i = 1; i < 101; i++){
            int c = 0;

            if (set1.get(i)){c++;}
            if (set2.get(i)){c++;}
            if (set3.get(i)){c++;}

            if (c > 1){
                res.add(i);
            }
        }

        return res;
    }
}

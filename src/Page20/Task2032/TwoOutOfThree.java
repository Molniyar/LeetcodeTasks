package Page20.Task2032;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class TwoOutOfThree {
    public static void main(String[] args) {

    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res = new ArrayList<>();

        BitSet set = new BitSet(101);
        for (int i = 0; i < nums1.length; i++){set.set(nums1[i]);}

        for (int n : nums2){//                    \
            if (set.get(n)){//                     \
                res.add(n);//                       \
                set.set(n,false);//                  }- nums2
            }//                                     /
        }//                                        /
        for (int n : nums2){set.set(n,true);}//   /

        for (int n : nums3){
            if (set.get(n) && !res.contains(n)){res.add(n);}
        }

        return res;
    }
}

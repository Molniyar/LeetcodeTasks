package Page22.Task2215;

import java.util.ArrayList;
import java.util.List;

public class FindDiffirenceOfThoArrays {
    public static void main(String[] args) {

    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>(2);
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        for (int i = 0;i < nums1.length; i++){
            int keep = nums1[i];
            boolean shouldBeAdded = true;

            for (int j = 0;j < nums2.length; j++){
                if (keep == nums2[j]){
                    shouldBeAdded = false;
                    break;
                }
            }

            if (shouldBeAdded && !result.get(0).contains(keep)){
                result.get(0).add(keep);
            }
        }

        for (int i = 0;i < nums2.length; i++){
            int keep = nums2[i];
            boolean shouldBeAdded = true;

            for (int j = 0;j < nums1.length; j++){
                if (keep == nums1[j]){
                    shouldBeAdded = false;
                    break;
                }
            }

            if (shouldBeAdded && !result.get(1).contains(keep)){
                result.get(1).add(keep);
            }
        }
        return result;
    }
}

package Page29.Task2956;

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {

    }
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result = new int[2];

        for (int i = 0; i < nums1.length; i++){
            int keep = nums1[i];
            for (int j = 0; j < nums2.length; j++){
                if (keep == nums2[j]){
                    result[0]++;
                    break;
                }
            }
        }
        for (int i = 0; i < nums2.length; i++){
            int keep = nums2[i];
            for (int j = 0; j < nums1.length; j++){
                if (keep == nums1[j]){
                    result[1]++;
                    break;
                }
            }
        }

        return result;
    }
}

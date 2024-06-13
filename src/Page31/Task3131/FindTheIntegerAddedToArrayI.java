package Page31.Task3131;

public class FindTheIntegerAddedToArrayI {
    public static void main(String[] args) {

    }
    public int addedInteger(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++){
            count += nums2[i]-nums1[i];
        }

        return count/nums1.length;
    }
}

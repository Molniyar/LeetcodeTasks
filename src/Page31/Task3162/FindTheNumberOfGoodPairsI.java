package Page31.Task3162;

public class FindTheNumberOfGoodPairsI {
    public static void main(String[] args) {

    }
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int res = 0;

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i]%(nums2[j]*k)==0) {
                    res++;
                }
            }
        }

        return res;
    }
}

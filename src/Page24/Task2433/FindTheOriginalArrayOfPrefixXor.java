package Page24.Task2433;

import java.util.Arrays;

public class FindTheOriginalArrayOfPrefixXor {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FindTheOriginalArrayOfPrefixXor().findArray(new int[]{5, 2, 0, 3, 1})));//5,7,2,3,2
    }
    public int[] findArray(int[] pref) {
        int keep = 0;

        for (int i = 0; i < pref.length; i++){
            pref[i] ^= keep;
            keep = pref[i] ^ keep;
        }

        return pref;
    }
}

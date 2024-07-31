package Page24.Task2433;

public class FindTheOriginalArrayOfPrefixXor {
    public static void main(String[] args) {

    }
    public int[] findArray(int[] pref) {
        if (pref.length < 2){
            return pref;
        }

        int keep = pref[0];
        for (int i = 1; i < pref.length; i++){
            int k = pref[i-1] ^ pref[i];
            pref[i-1] = keep;
            keep = k;
        }
        pref[pref.length-1] = keep;

        return pref;
    }
}

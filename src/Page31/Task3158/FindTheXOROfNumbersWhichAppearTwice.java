package Page31.Task3158;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class FindTheXOROfNumbersWhichAppearTwice {
    public static void main(String[] args) {

    }
    public int duplicateNumbersXOR(int[] nums) {
        BitSet set = new BitSet();
        int res = 0;

        for (int i : nums){
            if (set.get(i)){
                res ^= i;
                continue;
            }
            set.set(i);
        }

        return res;
    }
}

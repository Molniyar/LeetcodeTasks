package Page00.Task0003;

import java.util.BitSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        BitSet set = new BitSet();

        int res = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++){
            int n = s.charAt(i);

            if (set.get(n)) {
                if (res < count){
                    res = count;
                }

                i -= count;
                count = 0;

                set.clear();

                continue;
            }

            set.set(n);
            count++;
        }

        if (res < count){
            res = count;
        }

        return res;
    }
}

package Page32.Task3226;

import java.lang.foreign.MemorySegment;
import java.util.Base64;

public class NumberOfBitChangeToMakeTwoIntegersEqual {
    public static void main(String[] args) {

    }
    public int minChanges(int n, int k) {
        if ( (n & k) != k) {return -1;}
        return Integer.bitCount(n-k);
    }
}

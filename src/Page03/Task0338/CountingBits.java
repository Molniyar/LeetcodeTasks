package Page03.Task0338;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CountingBits().countBits(100)));
    }
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i < n+1; i++){
            result[i] = Integer.bitCount(i);
        }
        return result;
    }
}

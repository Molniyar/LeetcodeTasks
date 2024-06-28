package Page13.Task1356;

import java.util.Arrays;
import java.util.Comparator;

public class SortIntegersByBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortIntegersByBits().sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})));
    }
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + (Integer.bitCount(arr[i]) << 14);
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] & ((1 << 14)-1);
        }

        return arr;
    }
}

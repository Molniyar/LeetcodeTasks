package Page20.Task2022;

import java.util.Arrays;

public class Convert1DArrayInto2DArray {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Convert1DArrayInto2DArray().construct2DArray(new int[]{1, 2, 3}, 2, 2)));
    }
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length){return new int[][]{};}
        int[][] result = new int[m][n];
        for (int j = 0, i = 0, x = 0; j < m && x < original.length; i++, x++){
            if (i == n){i = 0; j++;}
            result[j][i] = original[x];
        }
        return result;
    }
}

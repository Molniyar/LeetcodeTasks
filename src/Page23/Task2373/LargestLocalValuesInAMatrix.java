package Page23.Task2373;

import java.util.Arrays;

public class LargestLocalValuesInAMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new LargestLocalValuesInAMatrix().largestLocal(new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 2, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}})));
    }
    public int[][] largestLocal(int[][] grid) {
        int[][] result = new int[grid.length - 2][grid.length - 2];
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result.length; j++){
                int i0 = Math.max(Math.max(grid[i][j],grid[i][j+1]),grid[i][j+2]);
                int i1 = Math.max(Math.max(grid[i+1][j],grid[i+1][j+1]),grid[i+1][j+2]);
                int i2 = Math.max(Math.max(grid[i+2][j],grid[i+2][j+1]),grid[i+2][j+2]);
                result[i][j] = Math.max(Math.max(i0,i1),i2);
            }
        }
        return result;
    }
}

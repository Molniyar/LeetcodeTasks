package Page13.Task1380;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        System.out.println(new LuckyNumbersInAMatrix().luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> inRow = new ArrayList<>(matrix.length);
        int[] inCol = new int[matrix[0].length];

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++){
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
            inRow.add(min);
        }
        for (int i = 0; i < matrix[0].length; i++){
            int max = 0;
            for (int j = 0; j < matrix.length; j++){
                if (matrix[j][i] > max){
                    max = matrix[j][i];
                }
            }
            inCol[i] = max;
        }
        for (int i = 0; i < inCol.length; i++){
            if (inRow.contains(inCol[i])){
                result.add(inCol[i]);
            }
        }
        return result;
    }
}

package Page15.Task1572;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        System.out.println(new MatrixDiagonalSum().diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
    public int diagonalSum(int[][] mat) {
        int result = 0;

        for (int i = 0, l = mat.length, j = l-1; i < l; i++,j--){
            result += mat[i][i];
            if (i == j){continue;}
            result += mat[i][j];
        }

        return result;
    }
}

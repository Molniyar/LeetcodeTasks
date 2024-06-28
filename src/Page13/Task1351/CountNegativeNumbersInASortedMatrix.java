package Page13.Task1351;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        System.out.println(new CountNegativeNumbersInASortedMatrix().countNegatives(new int[][] {{1,1,1,-1},{1,1,1,-1},{1,1,-1,-1},{-1,-1,-1,-1}}));
    }
    public int countNegatives(int[][] grid) {
        int result = 0;

        int endNum = grid[0].length-1;

        for (int y = 0; y < grid.length; y++){
            for (int x = endNum; x >= 0; x--){
                if (grid[y][x] < 0){
                    endNum--;
                    result += grid.length-y;
                }
            }
        }
        return result;
    }
}

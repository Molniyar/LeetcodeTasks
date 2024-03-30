package Page04.Task0463;

public class IslandPerimeter {
    public static void main(String[] args) {
        System.out.println(new IslandPerimeter().islandPerimeter(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
        System.out.println(new IslandPerimeter().islandPerimeter(new int[][]{{1, 0}}));
        System.out.println();
        System.out.println(new IslandPerimeter().islandPerimeter2(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
        System.out.println(new IslandPerimeter().islandPerimeter(new int[][]{{1, 0}}));
    }
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == 1) {
                    int upChunk = i - 1;
                    if (upChunk < 0 || grid[upChunk][j] == 0) {
                        result++;
                    }
                    int downChunk = i + 1;
                    if (downChunk >= grid.length || grid[downChunk][j] == 0) {
                        result++;
                    }

                    int leftChunk = j - 1;
                    if (leftChunk < 0 || grid[i][leftChunk] == 0) {
                        result++;
                    }
                    int rightChunk = j + 1;
                    if (rightChunk >= grid[i].length || grid[i][rightChunk] == 0) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
    public int islandPerimeter2(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length - 1; j++){
                result+= grid[i][j] ^ grid[i][j + 1];
            }
        }
        int j = 0;
        for (int i = 0; i < grid[j].length; i++){
            for (; j < grid.length - 1; j++){
                result+= grid[i][j] ^ grid[i + 1][j];
            }
        }
        return result;
    }
}

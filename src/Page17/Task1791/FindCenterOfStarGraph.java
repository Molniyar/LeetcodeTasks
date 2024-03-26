package Page17.Task1791;

public class FindCenterOfStarGraph {
    public static void main(String[] args) {
        System.out.println(new FindCenterOfStarGraph().findCenter(new int[][] {{1,2},{2,3},{4,2}}));
    }
    public int findCenter(int[][] edges) {
        int num1 = edges[0][0];
        int num2 = edges[0][1];
        int result = 0;
        for (int i = 0; i < edges.length; i++){

            for (int j = 1; j < edges[0].length; j++){
                if (num1 == edges[i][j]){
                    result = edges[i][j];
                }
                if (num2 == edges[i][j]){
                    result = edges[i][j];
                }
            }
        }
        return result;
    }
}

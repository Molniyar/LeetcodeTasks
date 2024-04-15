package Page17.Task1791;

public class FindCenterOfStarGraph {
    public static void main(String[] args) {
        System.out.println(new FindCenterOfStarGraph().findCenter(new int[][] {{1,2},{2,3},{4,2}}));
    }
    public int findCenter(int[][] edges) {
        int[] a1 = edges[0];
        int[] a2 = edges[1];
        if (a1[0] == a2[0] || a1[0] == a2[1]){return a1[0];}
        if (a1[1] == a2[0] || a1[1] == a2[1]){return a1[1];}
        return 0;
    }
}

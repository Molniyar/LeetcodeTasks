package Page16.Task1637;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public static void main(String[] args) {

    }
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] sorted = new int[points.length];

        for (int i = 0; i < points.length; i++){
            sorted[i] = points[i][0];
        }

        Arrays.sort(sorted);

        int res  = 0;
        int prev = sorted[0];

        for (int num : sorted){
            int distance = num-prev;

            if (res < distance){
                res = distance;
            }

            prev = num;
        }

        return res;
    }
}

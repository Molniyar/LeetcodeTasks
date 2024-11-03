package Page16.Task1637;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public static void main(String[] args) {//������� ��� ���� ����
        System.out.println(new WidestVerticalAreaBetweenTwoPointsContainingNoPoints().maxWidthOfVerticalArea(new int[][] {{8,7},{9,9},{7,4},{9,7}}));
    }
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        int res  = 0;
        int prev = points[0][0];

        for (int i = 0; i < points.length; i++){
            int num = points[i][0];
            int distance = num-prev;

            if (res < distance){
                res = distance;
            }

            prev = num;
        }

        return res;
    }
}

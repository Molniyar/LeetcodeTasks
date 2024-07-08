package Page05.Task0506;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class RelativeRanks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RelativeRanks().findRelativeRanks(new int[]{123123,11921,1,0,123})));
    }
    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];

        result[0] = "Gold Medal";
        if (result.length < 2){return result;}

        result[1] = "Silver Medal";

        if (result.length > 2){result[2] = "Bronze Medal";}


        for (int i = 3; i < result.length; i++){
            result[i] = i+1+"";
        }


        Arrays.sort(indexes, Comparator.comparingInt(index -> heights[index]));
        return result;
    }
}

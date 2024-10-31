package Page05.Task0506;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class RelativeRanks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RelativeRanks().findRelativeRanks(new int[]{123123,11921,1,0,123})));
    }
    public String[] findRelativeRanks(int[] score) {
        Integer[] indexes = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            indexes[i] = i;
        }

        Arrays.sort(indexes, Comparator.comparingInt(index -> score[index]));

        String[] sortedArray = new String[score.length];

        for (int i = 0; i < score.length-3; i++) {
            sortedArray[indexes[i]] = Integer.toString(score.length-i);
        }
        if (score.length > 0){sortedArray[indexes[score.length - 1]] = "Gold Medal";}
        if (score.length > 1){sortedArray[indexes[score.length - 2]] = "Silver Medal";}
        if (score.length > 2){sortedArray[indexes[score.length - 3]] = "Bronze Medal";}

        return sortedArray;
    }
}

package Page05.Task0506;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RelativeRanks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RelativeRanks().findRelativeRanks(new int[]{123123,11921,1,0,123})));
    }
    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];

        for (int i = 0; i < score.length; i++){
            int max = -1;
            int index = -1;
            for (int j = 0; j < score.length; j++){
                int keep = score[j];
                if (keep > max){
                    max = keep;
                    index = j;
                }
            }

            switch (i){
                case 0 -> result[index] = "Gold Medal";
                case 1 -> result[index] = "Silver Medal";
                case 2 -> result[index] = "Bronze Medal";
                default -> result[index] = i+1+"";
            }

            score[index] = -1;
        }
        return result;
    }
}

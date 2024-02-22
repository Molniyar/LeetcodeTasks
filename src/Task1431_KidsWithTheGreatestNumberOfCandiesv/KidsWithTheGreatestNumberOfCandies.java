package Task1431_KidsWithTheGreatestNumberOfCandiesv;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {
        System.out.println(new KidsWithTheGreatestNumberOfCandies().kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++){
            int x = candies[i] + extraCandies;
            int count = 0;
            for (int j = 0; j < candies.length; j++){
                if (x >= candies[j]){
                    count++;
                }
                else break;
            }
            if (count == candies.length){
                result.add(true);
            }
            else result.add(false);
        }
        return result;
    }
}

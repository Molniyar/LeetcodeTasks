package Page14.Task1431;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {
        System.out.println(new KidsWithTheGreatestNumberOfCandies().kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int biggestNOfCandies = 0;
        for (int n : candies) {
            if (n > biggestNOfCandies) {
                biggestNOfCandies = n;
            }
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= biggestNOfCandies);
        }
        return result;
    }
}

package Page10.Task1051;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        System.out.println(new HeightChecker().heightChecker(new int[]{1, 2, 1, 3, 4, 3}));
    }
    public int heightChecker(int[] heights) {
        int[] sortedHeights = heights.clone();
        Arrays.sort(sortedHeights);
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(sortedHeights));
        int result = 0;
        for (int i = 0; i < heights.length; i++){
            if (heights[i] != sortedHeights[i]){
                result++;
            }
        }
        return result;
    }
}

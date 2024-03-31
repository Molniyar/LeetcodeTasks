package Page13.Task1365;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
         System.out.println(getIndexOfNum(new int[]{1, 2, 2, 3, 8}, 8));
        System.out.println(getIndexOfNum2(new int[]{1, 2, 2, 3, 8}, 8));
        System.out.println(Arrays.toString(new HowManyNumbersAreSmallerThanTheCurrentNumber().smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        for (int i = 0; i < nums.length; i++){
            nums[i] = getIndexOfNum(sortedNums, nums[i]);
        }
        return nums;
    }
    public static int getIndexOfNum(int[] sortedNums, int num){
        if (sortedNums[0] == num)return 0;
        int min = 0;
        int max = sortedNums.length - 1;
        for (;max - min != 1;){
            int result = (max + min) / 2;
            if (sortedNums[result] < num){
                min = result;
            }
            else max = result;
        }
        return max;
    }
    public static int getIndexOfNum2(int[] sortedNums, int num){
        for (int i = 0; i < sortedNums.length; i++){
            if (sortedNums[i] == num){
                return i;
            }
        }
        return -1;
    }
}

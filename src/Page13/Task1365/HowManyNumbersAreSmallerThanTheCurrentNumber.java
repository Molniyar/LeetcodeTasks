package Page13.Task1365;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        System.out.println(getIndexOfNum(new int[]{1, 2, 2, 3, 8}, 8));
        System.out.println(Arrays.toString(new HowManyNumbersAreSmallerThanTheCurrentNumber().smallerNumbersThanCurrent2(new int[]{8, 1, 2, 2, 3})));
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

    public int[] smallerNumbersThanCurrent2(int[] nums) {
        short[] numArr = new short[101];
        for (int num : nums) {
            numArr[num]++;
        }
        for (int i = 1; i < numArr.length; i++) {
            numArr[i] += numArr[i-1];
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0) {
                nums[i] = numArr[nums[i] - 1];
            }
        }
        return nums;
    }
}

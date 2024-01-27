package Task27_removeElement;

import Task1576_ReplaseAllQuastionsToAvoidConsecutiveRepeatingCharacters.ReplseQuastions;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] arrayTest1 = new int[5];
        for (int i = 0; i < arrayTest1.length; i++) {
            int low = 0;
            int high = 9;
            int random = low + (int) (Math.random() * (high - low + 1));
            arrayTest1[i] = random;
        }
        int intTest1 = 6;

        int[] arrayTest2 = new int[]{3, 2, 2, 3};
        int intTest2 = 3;

        System.out.println(new RemoveElement().removeElement(arrayTest2, intTest2));
        System.out.println(new RemoveElement().removeElement(new int[]{3, 2, 2, 3, 3}, 3));

    }
    public int removeElement(int[] nums, int val) {
        int[] returnArray = new  int[nums.length];
        int rACount = 0;
        int length = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                returnArray[rACount] = nums[i];
                rACount++;
                length++;
            }
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = returnArray[i];
        }

        System.out.println(Arrays.toString(nums));
        return length;
    }
}

package Task1512_NumberOfGoodPairs;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] test0 = {1,2,3,1,1,3};
        int[] test1 = {};
        int[] test2 = {};
        int[] test3 = {};
        int[] test4 = {};

        int[] problem0 = {};

        System.out.println(new NumberOfGoodPairs().numIdenticalPairs(test0));
    }
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    result++;
                }
            }
        }
        return result;
    }
}

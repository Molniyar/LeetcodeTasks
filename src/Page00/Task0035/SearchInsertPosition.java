package Page00.Task0035;

public class SearchInsertPosition {
    public static void main(String[] args) {

    }
    public int searchInsert(int[] nums, int target) {
        for (int i = 0;i < nums.length;i++){
            if (nums[i] < target){
                continue;
            }
            return i;
        }
        return nums.length;
    }
}

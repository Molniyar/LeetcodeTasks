package Page01.Task0169;

public class MajorityElement {
    public static void main(String[] args) {
        int[] test  = {1, 2, 1, 5, 5, 1, 1, 1, 1, 2, 1};
        int[] test1 = {3, 2, 3};
        int[] test2 = {3, 2, 3, 2, 3, 4, 3};
        int[] test3 = {3, 2, 3, 2, 3, 4, 3, 2, 3, 7, 3, 9, 3, 5, 3, 6, 3, 4, 3, 7, 3, 6, 3, 4, 3, 3, 2, 3, 1, 3};
        int[] failed = {-1, 100, 2, 100, 100, 4, 100};

        System.out.println(new MajorityElement().majorityElement(failed));
    }
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}

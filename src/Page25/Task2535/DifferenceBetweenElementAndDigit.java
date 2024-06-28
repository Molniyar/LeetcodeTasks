package Page25.Task2535;

public class DifferenceBetweenElementAndDigit {
    public static void main(String[] args) {
        System.out.println(new DifferenceBetweenElementAndDigit().differenceOfSum(new int[]{1, 15, 6, 3}));
    }
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int num : nums) {
            elementSum += num;
            for (int j = num; j != 0; j /= 10) {
                digitSum += (j % 10);
            }
        }
        return elementSum - digitSum;
    }
}

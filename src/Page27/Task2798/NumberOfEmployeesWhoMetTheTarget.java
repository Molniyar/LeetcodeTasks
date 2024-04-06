package Page27.Task2798;

public class NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {

    }
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result = 0;
        for (int hour : hours) {
            if (hour >= target) {
                result++;
            }
        }
        return result;
    }
}

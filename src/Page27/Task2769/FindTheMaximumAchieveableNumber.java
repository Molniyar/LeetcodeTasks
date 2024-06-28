package Page27.Task2769;

public class FindTheMaximumAchieveableNumber {
    public static void main(String[] args) {
        int num  = 4;
        int num1 = 3;
        int t  = 1;
        int t1 = 2;

        System.out.println(new FindTheMaximumAchieveableNumber().theMaximumAchievableX(num1, t1));
    }
    public int theMaximumAchievableX(int num, int t) {
        int x = num + t + t;
        return x;
    }
}

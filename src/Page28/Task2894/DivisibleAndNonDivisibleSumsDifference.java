package Page28.Task2894;

public class DivisibleAndNonDivisibleSumsDifference {
    public static void main(String[] args) {
        System.out.println(new DivisibleAndNonDivisibleSumsDifference().differenceOfSums(10, 3));
    }
    public int differenceOfSums(int n, int m) {
        int notDivisible = 0;
        int divisible = 0;
        for (int i = 1; i <= n; i++){
            if (i % m == 0){
                divisible += i;
            }
            else notDivisible += i;
        }
        return notDivisible - divisible;
    }
}

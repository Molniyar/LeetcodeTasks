package Page28.Task2894;

public class DivisibleAndNonDivisibleSumsDifference {
    public static void main(String[] args) {
        System.out.println(new DivisibleAndNonDivisibleSumsDifference().differenceOfSums(10, 3));
    }
    public int differenceOfSums(int n, int m) {
        int all = divisibleSum(n,1);

        int divisible = divisibleSum(n,m);
        return all - divisible - divisible;
    }
    public static int divisibleSum(int n, int divide){
        return n/divide * (n/divide+1)/2*divide;
    }
}

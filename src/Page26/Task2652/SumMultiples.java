package Page26.Task2652;

public class SumMultiples {
    public static void main(String[] args) {
        System.out.println(new SumMultiples().sumOfMultiples(7));
        System.out.println(divisibleSum(10,2));
    }
    public int sumOfMultiples(int n) {
        int minus = divisibleSum(n,3*5) + divisibleSum(n,3*7) + divisibleSum(n,5*7) - divisibleSum(n,3*5*7);
        return divisibleSum(n,3) + divisibleSum(n,5) + divisibleSum(n,7) - minus;
    }
    public static int divisibleSum(int n, int divide){
        return n/divide * (n/divide+1)/2*divide;
    }
}

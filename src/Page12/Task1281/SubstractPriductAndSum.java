package Page12.Task1281;

public class SubstractPriductAndSum {
    public static void main(String[] args) {
        System.out.println(new SubstractPriductAndSum().subtractProductAndSum(4421));
    }
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        for (int i = n; i != 0; i /= 10){
            int digit = (i % 10);
            sum += digit;
            product *= digit;
        }
        System.out.println(sum);
        System.out.println(product);
        return product - sum;
    }
}

package Task1281_SubstractPriductAndSum;

public class SubstractPriductAndSum {
    public static void main(String[] args) {
        System.out.println(new SubstractPriductAndSum().subtractProductAndSum(4421));
    }
    public int subtractProductAndSum(int n) {
        String N = n + "";
        int product = 0;
        int sum = 0;
        for (int i = 0; i < N.length(); i++){
            if (i == 0){
                product = N.charAt(i) - 48;
            }
            else product = product * (N.charAt(i) - 48);
        }
        for (int i = 0; i < N.length(); i++){
            sum += (N.charAt(i) - 48);
        }
        return product - sum;
    }
}

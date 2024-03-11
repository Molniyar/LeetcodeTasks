package Task202_HappyNumber;
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(19));
    }
    public boolean isHappy(int n) {
        boolean result = false;
        for (;true;){
            if (n <= 4){
                if ((n) == 1){
                    result = true;
                }
                break;
            }
            int newN = 0;
            for (int i = n; i != 0; i /= 10){
                newN += (i % 10) * (i % 10);
            }
            System.out.println(n);
            n = newN;
        }
        return result;
    }
}

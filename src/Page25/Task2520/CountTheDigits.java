package Page25.Task2520;

public class CountTheDigits {
    public static void main(String[] args) {
        System.out.println(new CountTheDigits().countDigits(1248));
    }
    public int countDigits(int num) {
        int result = 0;
        for (int i = num; i != 0; i /= 10){
            if (num % (i % 10) == 0){
                result++;
            }
            int digit = (i % 10);
        }
        return result;
    }
}

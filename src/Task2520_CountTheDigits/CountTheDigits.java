package Task2520_CountTheDigits;

import java.io.FilterOutputStream;

public class CountTheDigits {
    public static void main(String[] args) {
        System.out.println(new CountTheDigits().countDigits(1248));
    }
    public int countDigits(int num) {
        String sNum = num + "";
        int result = 0;
        for (int i = 0; i < sNum.length(); i ++){
            double d = (double) num / (sNum.charAt(i) - 48);
            if (d == (int)d){
                result++;
            }
        }
        return result;
    }
}

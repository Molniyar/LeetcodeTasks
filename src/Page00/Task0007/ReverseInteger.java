package Page00.Task0007;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(1534236469));//2147483647
    }
    public int reverse(int x) {
        int result = 0;

        for (int i = x; i != 0; i /= 10){
            int digit = i % 10;

            result*= 10;
            result+= digit;

            if (result % 10 != digit){return 0;}
        }

        return result;
    }
}

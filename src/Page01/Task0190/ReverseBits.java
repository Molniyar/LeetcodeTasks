package Page01.Task0190;

public class ReverseBits {
    public static void main(String[] args) {

        int n = 21323;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(new ReverseBits().reverseBits(n)));
        System.out.println(new ReverseBits().reverseBits(n));
    }
    public int reverseBits(int n) {
        int result = 0;
        if (n < 0){result |= 1;}
        for (int j = 1;j <= 31; j++){
            result |= (((n & (1 << 31-j)) > 0) ? 1 : 0) << j;
        }
        if (n % 2 == 1){result |= -2147483648;}
        return result;
    }

}

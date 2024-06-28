package Page28.Task2864;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumOddBinaryNumber  {
    public static void main(String[] args) {
        System.out.println(new MaximumOddBinaryNumber().maximumOddBinaryNumber("1011110"));
    }
    public String maximumOddBinaryNumber(String s) {
        char[] res = new char[s.length()];

        int bitCount = -1;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                bitCount++;
            }
        }

        res[s.length()-1] = '1';

        Arrays.fill(res,0,bitCount+1,'1');
        Arrays.fill(res,bitCount,res.length-1,'0');

        return new String(res);
    }
}

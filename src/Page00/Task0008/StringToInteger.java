package Page00.Task0008;

import java.io.FileNotFoundException;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(new StringToInteger().myAtoi("-91283472332"));
    }
    public int myAtoi(String s) {
        int startIndex = 0;

        boolean hasMinus = false;

        while (startIndex < s.length()) {
            boolean break_ = false;
            switch (s.charAt(startIndex)){
                case '-' -> {
                    hasMinus=true;
                    startIndex++;
                    break_ = true;
                }
                case '+' -> {
                    hasMinus=false;
                    startIndex++;
                    break_ = true;
                }
                case '0','1','2','3','4','5','6','7','8','9' -> {
                    break_ = true;
                }
                case ' ' -> {
                    break;
                }
                default -> {
                    return 0;
                }
            }
            if (break_){
                break;
            }
            startIndex++;
        }


        int res = 0;

        for (;startIndex < s.length() && s.charAt(startIndex) >= '0' && s.charAt(startIndex) <= '9';startIndex++){
            try {
                res *= 10;
                res += s.charAt(startIndex)-'0';

                if (res%10 != (s.charAt(startIndex)-'0') || res < 0){
                    if (hasMinus){return -2147483648;}
                    return 2147483647;
                }
            } catch (NumberFormatException e) {

                if (hasMinus){return -2147483648;}
                return 2147483647;
            }
        }

        if (hasMinus){res = -res;}
        return res;
    }
}

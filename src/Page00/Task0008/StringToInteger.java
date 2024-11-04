package Page00.Task0008;

import java.io.FileNotFoundException;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(new StringToInteger().myAtoi("  -0012a42"));
    }
    public int myAtoi(String s) {
        int startIndex = 0;
        boolean hasMinus = false;
        boolean isNum    = false;
        int res = 0;

        while (startIndex < s.length()) {
            boolean break_ = false;
            switch (s.charAt(startIndex)){
                case '-' -> {
                    if (isNum){break_ = true;break;}
                    hasMinus=true;
                    isNum = true;
                    //System.out.println("minus");
                }
                case '+' -> {
                    if (isNum){break_ = true;break;}
                    hasMinus=false;
                    isNum = true;
                    //System.out.println("plus");
                }
                case '0','1','2','3','4','5','6','7','8','9' -> {
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
                    //System.out.println("res is: " + res + " now");
                    isNum = true;
                }
                case ' ' -> {
                    if (isNum){break_ = true;break;}
                    //System.out.println("   _   ");
                }
                default -> {
                    //System.out.println("default");
                    break_ = true;
                }
            }
            if (break_){
                break;
            }
            startIndex++;
        }

        if (hasMinus){res = -res;}
        return res;
    }

}

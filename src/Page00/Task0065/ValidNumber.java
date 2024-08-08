package Page00.Task0065;

import Page31.Task3194.MinimumAverageOfSmallestAndLargestElements;

public class ValidNumber {
    public static void main(String[] args) {

    }
    public boolean isNumber(String s) {
        boolean e = false;
        boolean dot = false;
        boolean n = false;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case '1','2','3','4','5','6','7','8','9','0' -> n = true;
                case 'e','E' -> {
                    if (e || !n) {return false;}
                    e = true;
                    n = false;
                }
                case '.' -> {
                    if (dot || e) {return false;}
                    dot = true;
                }
                case '+', '-' -> {
                    if (i!=0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E') {return false;}// e - это как начало числа
                }
                default -> {
                    return false;
                }
            }
        }
        return n;
    }
}

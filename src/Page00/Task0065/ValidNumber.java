package Page00.Task0065;

import Page31.Task3194.MinimumAverageOfSmallestAndLargestElements;

public class ValidNumber {
    public static void main(String[] args) {

    }
    public boolean isNumber(String s) {
        boolean e = false;//was the previous char 'e' or 'E'
        boolean n = false;//is number
        boolean d = false;//was the previous char '.'

        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case '0','1','2','3','4','5','6','7','8','9' -> n = true;
                case '.' ->{
                    if (d || e) {return false;}
                    d = true;
                }
                case 'e','E' -> {
                    if (e || !n){return false;}
                    e = true;
                    n = false;
                }
                case '+','-' -> {
                    if (i != 0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E') {return false;}
                    n = false;
                }
                default -> {return false;}
            }
        }

        return n;
    }
}

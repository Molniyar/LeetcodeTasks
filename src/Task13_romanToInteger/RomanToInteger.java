package Task13_romanToInteger;

public class RomanToInteger {
    public static void main(String[] args) {
        String test  = "XIV";//14
        String test1 = "XXIVII";//26

        System.out.println(new RomanToInteger().romanToInt(test1));
    }
    public int romanToInt(String s) {
        int result = 0;
        String chars = "IVXLCDM";

        for (int i = 0; i < s.length(); i++){
            int plus = i + 1;
            if (plus >= s.length()){
                plus = s.length() - 1;
            }

            if (chars.indexOf(s.charAt(i)) >= chars.indexOf(s.charAt(plus))){
                switch (s.charAt(i)) {
                    case 'I' -> result += 1;
                    case 'V' -> result += 5;
                    case 'X' -> result += 10;
                    case 'L' -> result += 50;
                    case 'C' -> result += 100;
                    case 'D' -> result += 500;
                    case 'M' -> result += 1000;
                }
            }
            if (chars.indexOf(s.charAt(i)) < chars.indexOf(s.charAt(plus))){
                switch (s.charAt(i)){
                    case 'I' -> result -= 1;
                    case 'V' -> result -= 5;
                    case 'X' -> result -= 10;
                    case 'L' -> result -= 50;
                    case 'C' -> result -= 100;
                    case 'D' -> result -= 500;
                    case 'M' -> result -= 1000;
                }
            }
        }
        return result;
    }
}

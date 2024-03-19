package Task13_romanToInteger;

public class RomanToInteger {
    public static void main(String[] args) {
        String test  = "XIV";//14
        String test1 = "XXIVII";//26

        System.out.println(new RomanToInteger().romanToInt(test));
    }
    public int romanToInt(String s) {
        int result = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            int add = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
            if (add >= prev){
                result += add;
            }
            else {
                result -= add;
            }
            prev = add;
        }
        return result;
    }
}

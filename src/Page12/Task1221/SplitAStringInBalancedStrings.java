package Page12.Task1221;

public class SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        System.out.println(new SplitAStringInBalancedStrings().balancedStringSplit("RLRRRLLRLL"));
    }
    public int balancedStringSplit(String s) {
        int result = 0;
        int RCount = 0;
        int LCount = 0;
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case 'R' -> RCount++;
                case 'L' -> LCount++;
            }
            if (RCount == LCount){
                result++;
                RCount = 0;
                LCount = 0;
            }
        }
        return result;
    }
}

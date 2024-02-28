package Task202_HappyNumber;
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(7));
    }
    public boolean isHappy(int n) {
        boolean result = false;
        for (;true;){
            if (n <= 4){
                if ((n) == 1){
                    result = true;
                }
                break;
            }
            int newN = 0;
            String s = n + "";
            boolean break_ = false;
            for (int i = 0; i < s.length(); i++){
                //if (s.charAt(i) - 48 == n){
                //    break_ = true;
                //    break;
                //}
                newN = newN + (s.charAt(i) - 48) * (s.charAt(i) - 48);
            }
            System.out.println(n);
            if (break_){
                break;
            }
            n = newN;
        }
        return result;
    }
}

package Page22.Task2264;

public class Largest3_Same_DigitNumberInString {
    public static void main(String[] args) {
        System.out.println(new Largest3_Same_DigitNumberInString().largestGoodInteger("3200014888"));
    }
    public String largestGoodInteger(String num) {
        char resChar = 0;
        int count = 0;
        char keep = 0;

        int start = 0;
        int end = 0;
        for (int i = 0; i < num.length(); i++){
            char char_ = num.charAt(i);
            if (keep != char_){
                count = 1;
                keep = char_;

                continue;
            }

            count++;

            if (count == 3 && char_ > resChar){
                start = i-2;
                end   = i+1;

                resChar = char_;
            }
        }

        return num.substring(start, end);
    }
}

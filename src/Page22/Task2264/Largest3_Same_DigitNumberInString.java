package Page22.Task2264;

public class Largest3_Same_DigitNumberInString {
    public static void main(String[] args) {
        System.out.println(new Largest3_Same_DigitNumberInString().largestGoodInteger("3200014888"));
    }
    public String largestGoodInteger(String num) {
        int result = -1;
        int count = 0;
        int keep = 0;
        int i = 0;
        for (; i < num.length(); i++){
            if (i < num.length()-2 && num.charAt(i) == num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)){
                if (num.charAt(i) - 48 > result){
                    result = num.charAt(i) - 48;
                    i+=2;
                    keep = i;
                }
            }
        }
        if (result == -1){return "";}
        return num.substring(keep - 2,keep + 1);
    }
}

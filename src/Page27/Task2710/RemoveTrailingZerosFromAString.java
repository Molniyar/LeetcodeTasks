package Page27.Task2710;

public class RemoveTrailingZerosFromAString {
    public static void main(String[] args) {

    }
    public String removeTrailingZeros(String num) {
        int index = num.length()-1;
        for (; index >= 0; index--){
            if (num.charAt(index) != '0'){
                break;
            }
        }
        return num.substring(0,index+1);
    }
}

package Page24.Task2437;

public class NumberOfValidClockTimes {
    public static void main(String[] args) {

    }
    public int countTime(String time) {
        int result = 1;

        if (time.charAt(0)=='?'||time.charAt(1)=='?'){
            if (time.charAt(0)=='?'){
                if (time.charAt(1)=='?'){
                    result*=24;
                }
                else {
                    if (time.charAt(1)-'0' < 4){
                        result*=3;
                    }
                    else result*=2;
                }
            }
            else {
                if (time.charAt(0)-'0' < 2){
                    result*=10;
                }
                else result*=4;
            }
        }
        if (time.charAt(3)=='?'){
            result*=6;
        }
        if (time.charAt(4)=='?'){
            result*=10;
        }
        return result;
    }
}

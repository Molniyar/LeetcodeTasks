package Page13.Task1342;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {

    }
    public int numberOfSteps(int num) {
        int result = 0;
        for (; num > 0; result++){
            if (num % 2 == 0){
                num /= 2;
            }
            else num--;
        }
        return result;
    }
}

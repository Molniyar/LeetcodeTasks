package Page13.Task1342;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {

    }
    public int numberOfSteps(int num) {
        if (num == 0){return 0;}
        return (Integer.bitCount(Integer.highestOneBit(num)-1)) + Integer.bitCount(num);
    }
}

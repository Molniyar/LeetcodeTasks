package Page30.Task3099;

public class HarshadNumber {
    public static void main(String[] args) {

    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sumOfDigits = 0;
        for (int i = x; i != 0; i /= 10){
            sumOfDigits += (i % 10);
        }
        if (x % sumOfDigits == 0){
            return sumOfDigits;
        }
        else return -1;
    }
}

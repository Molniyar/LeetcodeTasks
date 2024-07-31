package Page21.Task2169;

public class CountOperationsToObtainZero {
    public static void main(String[] args) {

    }
    public int countOperations(int num1, int num2) {
        if (num1 == 0 || num2 == 0){
            return 0;
        }
        else {
            if (num1 > num2){
                num1 -= num2;
            }
            else num2 -= num1;

            return countOperations(num1,num2)+1;
        }
    }
}

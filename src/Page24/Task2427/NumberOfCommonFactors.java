package Page24.Task2427;

public class NumberOfCommonFactors {
    public static void main(String[] args) {

    }
    public int commonFactors(int a, int b) {
        int result = 0;
        for (int i = 1;i <= Math.min(a,b);i++){
            if (a%i == 0 && b%i == 0){result++;}
        }
        return result;
    }
}

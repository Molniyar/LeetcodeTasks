package Page24.Task2427;

public class NumberOfCommonFactors {
    public static void main(String[] args) {

    }
    public int commonFactors(int a, int b) {
        int endNum = 0;
        for (int big = Math.max(a,b), min = Math.min(a,b);;){
            int keep = min;
            min = big % min;
            big = keep;
            if (min == 0){
                endNum = big;
                break;
            }
        }
        int result = 1;
        for (int i = 1;i <= endNum;i++){
            if (a%i == 0 && b%i == 0){result++;}
        }
        return result;
    }
}

package Page24.Task2427;

public class NumberOfCommonFactors {
    public static void main(String[] args) {
        System.out.println(new NumberOfCommonFactors().commonFactors(12,6));
        System.out.println(new NumberOfCommonFactors().commonFactors(43,945));
        System.out.println(new NumberOfCommonFactors().commonFactors(25,30));
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
        int result = 0;
        int int_ = (int) Math.sqrt(endNum);
        for (int i = 1;i <= int_;i++){
            if (a%i == 0 && b%i == 0){
                result++;
                if (i != endNum / i) {
                    result++;
                }
            }
        }
        return result;
    }
}

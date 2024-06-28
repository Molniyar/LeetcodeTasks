package Page24.Task2160;

public class FindThePivotInteger {
    public static void main(String[] args) {

    }
    public int minimumSum(int num) {
        int min1 = 10;
        int min2 = 10;
        for (int i = num; i != 0; i /= 10){
            int digit = i % 10;
            if (digit < min1){
                min2 = min1;
                min1 = digit;
            }
            else if (digit < min2){
                min2 = digit;
            }
        }
        int max1 = -1;
        int max2 = -1;
        for (int i = num; i != 0; i /= 10){
            int digit = i % 10;
            if (digit > max1){
                max2 = max1;
                max1 = digit;
            }
            else if (digit > max2){
                max2 = digit;
            }
        }
        return ((min1 * 10) + max1) + ((min2 * 10) + max2);
    }
}

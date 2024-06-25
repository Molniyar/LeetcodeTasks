package Page29.Task2960;

public class CountTestedDevicesAfterTestOperations {
    public static void main(String[] args) {

    }
    public int countTestedDevices(int[] batteryPercentages) {
        int res = 0;

        for (int i = 0; i < batteryPercentages.length; i++){
            if (batteryPercentages[i] - res <= 0){
                continue;
            }
            res++;
        }

        return res;
    }
}

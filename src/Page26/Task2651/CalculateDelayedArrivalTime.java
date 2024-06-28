package Page26.Task2651;

public class CalculateDelayedArrivalTime {
    public static void main(String[] args) {

    }
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime)%24;
    }
}

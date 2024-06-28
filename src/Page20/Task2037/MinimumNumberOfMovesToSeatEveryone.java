package Page20.Task2037;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public static void main(String[] args) {

    }
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int result = 0;
        for (int i = 0; i < seats.length; i++){
            result+= Math.abs(students[i] - seats[i]);
        }
        return result;
    }
}

package Page24.Task2469;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertTheTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float celsius = input.nextFloat();

        System.out.println(Arrays.toString(new ConvertTheTemperature().convertTemperature(celsius)));
    }

    public double[] convertTemperature(double celsius) {
        return new double[] {
            celsius + 273.15,
            celsius * 1.80 + 32.00,
        };
    }
}
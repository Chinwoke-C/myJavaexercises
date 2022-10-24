package Practice;

import java.util.Arrays;

public class Analyzer {
    public static double average;

    public static int arraySize(int[] numbers) {

        return numbers.length;
    }

    public static int arraySum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static double getAverage(int[] numbers) {
         average = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sum += numbers[i];
             average = (double) sum/numbers.length;

        }
        return average;
    }

    public static int getElement(int[] numbers) {
        int count = 0;
        for (int i = 0; i < 5 ; i++) {
            if (numbers[i] > average);
            count++;
        }
        return count;
    }
}

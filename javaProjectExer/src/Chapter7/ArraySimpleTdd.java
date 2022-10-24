package Chapter7;

public class ArraySimpleTdd {
    public static int sum;
    public static int min;

    public static int max;

    public static int getSum(int[] numbers) {

        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum;
    }


    public static int getMinimum(int[] numbers) {
        min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];

            }

        }
        return min;
    }

    public static int getMaximum(int[] numbers) {
        max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        return max;
    }

    public static int getMaxSum(int[] numbers) {
        sum = 0;
        int maxSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] < min) {
                min = numbers[i];
            }
            maxSum = sum - min;


        }
        return maxSum;
    }
}



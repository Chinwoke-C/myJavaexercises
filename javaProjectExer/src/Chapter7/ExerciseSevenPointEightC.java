package Chapter7;

import java.security.SecureRandom;

public class ExerciseSevenPointEightC {
    public static void main(String[] args) {
        SecureRandom randomNum = new SecureRandom();
        double[] rey = new double[100];

        for (int i = 0; i < rey.length ; i++) {
            double value = 1 + randomNum.nextDouble(30);
            rey[i] = value;
        }
        for (int j = 0; j < rey.length ; j++) {
            System.out.printf(" %.2f%n",rey[j]);
        }
        double maximumNum = rey[0];
        for (int i = 0; i <= 99 ; i++) {
            if (rey[i] > maximumNum){
                maximumNum = rey[i];
            }

        }
        System.out.printf("%nThe maximum number of the first 30 elements in the array is:%.2f%n", maximumNum);
    }
}

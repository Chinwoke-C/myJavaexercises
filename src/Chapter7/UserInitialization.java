package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class UserInitialization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] myRays = new double[10];

        System.out.println("Enter 10 values: ");
        for (int i = 0; i < myRays.length ; i++) {
         myRays[i] = input.nextDouble();

        }
        System.out.println("Contents of the array are:" + Arrays.toString(myRays));
    }
}

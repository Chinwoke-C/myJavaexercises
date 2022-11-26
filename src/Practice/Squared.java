package Practice;

import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print(" Enter second integer: ");
        int number2 = input.nextInt();

        int Squared = number1 * number2;
        System.out.printf("Squared of the value is: %d%n", Squared);

        int sum = number1 + number2;
        System.out.printf("sum of the value is: %d%n", sum);

        int minus = number2 - number1;
        System.out.printf("differnce of the value is: %d%n", minus);
    }
}

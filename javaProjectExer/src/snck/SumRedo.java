package snck;

import java.util.Scanner;

public class SumRedo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        char choice;
        do {
            System.out.print("Enter first integer: ");
            number1 = input.nextInt();

            System.out.println("Enter second integer: ");
            number2 = input.nextInt();

            int sum = number1 + number2;
            System.out.printf("The sum of numbers is: %d%n", sum);

            System.out.print("Do you want to continue y/n? ");
            choice = input.next().charAt(0);

            System.out.println();

        } while (choice=='y' || choice=='Y');


    }
}

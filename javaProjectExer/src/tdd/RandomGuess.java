package tdd;

import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        int actualNumber = 10;
        int count = 0;
        Scanner input = new Scanner(System.in);



        while (count != -1) {
            count++;
            System.out.print("Guess a Number: ");
            int number = input.nextInt();

            if (number < actualNumber) {
                System.out.println("Too low, try again!");
            } else if (number > actualNumber) {
                System.out.println("Too high, try again!");
            } else {

                System.out.println("Perfect!");
                break;

            }

        }
    }
}


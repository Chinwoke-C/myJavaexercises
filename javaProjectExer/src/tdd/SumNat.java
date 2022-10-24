package tdd;

import java.util.Scanner;

public class SumNat {
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        while (counter <= 10){
            System.out.print("Enter the first 10 natural numbers: ");
            int number = input.nextInt();
            if(number <= 10){
                sum += number;

            }
        }counter++;
        System.out.printf("The sum is: %d%n", sum);
    }

}

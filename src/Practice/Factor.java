package Practice;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
//        for (int i = 1; i <= number ; i++) {
//            if (number % i == 0){
            int i = 1;
            int sum = 0;
                while (i < number) {
                    if (number % i == 0) {
                        System.out.print(i + " ");

                        sum += i;
                    }
                    i++;
                }
        System.out.printf("The sum of the factor is: %d",sum);
        System.out.println();
                if (sum == number){
                    System.out.println("The number is a perfect number");
                } else {
                    System.out.println("not a perfect number");
                }

        }
    }
//}

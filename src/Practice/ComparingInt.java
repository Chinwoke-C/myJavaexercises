package Practice;
//(Comparing Integers) Write an application that asks the user to enter one integer, obtains
   //     it from the user and displays whether the number and its square are greater than, equal to, not equal
   //     to, or less than the number 100. Use the techniques shown in Fig. 2.15.

import java.util.Scanner;

public class ComparingInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer");
        int number = input.nextInt();

        int square = number * number;

        if ((number + square) > 100) {
                System.out.printf("%n%d and its square %d is greater than 100: ", number, square);
            }
            System.out.println();
        if ((number + square) == 100){
                System.out.printf("The %d and its %d is 100:", number, square);
                }
            System.out.println();
        if ((number + square) != 100){
                    System.out.printf("The %d and its %d is not equal to 100",number, square);
                    }
        if ((number + square) < 100) {
                    System.out.printf("The %d and its %d is less than 100", number, square);
            }

                }
        }



package Practice;

import java.util.Objects;
import java.util.Scanner;

public class PracticingIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How can we help you? Are you an adult or child?");
        String input = scanner.nextLine();

        if (input.equals("adult")){
            System.out.println("Your price is #35");
            System.out.println("Are you a male or female, press M or F");
            String male = scanner.nextLine();
            if (male.equals("M")){
                System.out.println("you can only buy 4 bottles of beer");
            }
            else {
                System.out.println("You can only buy 2 bottles of beer");
            }
        }
        else {
            System.out.println("You cannot afford a beer");
        }
//    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade");
        int grade = scanner.nextInt();

         if (grade > 100){
            System.out.println("You cannot get more than 100");
            System.out.println("You got a 'B'");
           }
        else if (grade >= 70 && grade < 100){
            System.out.println("You got an 'A'");
        }
        else
            if(grade >= 60 && grade < 70){
           }
        System.out.println(grade >= 70 ? "passed" : "failed");
    }
}

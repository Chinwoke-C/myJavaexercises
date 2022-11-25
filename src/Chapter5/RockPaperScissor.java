package Chapter5;

// todo(Game: scissor, rock, paper) Write a program that plays the popular scissor-rock paper game. (A scissor can cut a paper,
//  a rock can knock a scissor, and a paper can
//        wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
//        scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
//        2 and displays a message indicating whether the user or the computer wins, loses,
//        or draws.


import java.security.SecureRandom;
import java.util.Scanner;

public class RockPaperScissor {
    static int response;
    static int computer;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        System.out.println("Enter a number");
        System.out.println("Scissor (0), rock (1), paper (2)");
         response = input.nextInt();
        computer = random.nextInt(3);
        switch (response) {
            case 0 -> System.out.println("you played scissor");
            case 1 -> System.out.println("you played rock");
            case 2 -> System.out.println("you played paper");
            default -> throw new IllegalArgumentException("Enter any number between 0 - 2");
        }

        switch (computer) {
            case 0 -> System.out.println("Computer played Scissor");
            case 1 -> System.out.println("Computer played rock");
            case 2 -> System.out.println("Computer played paper");
        }
        gameStatus();

    }
        public static void gameStatus(){
                if (response == 0 && computer == 0) {
                    System.out.println("its a draw");

                } else if (response == 0 && computer == 1){
                    System.out.println("computer wins");

                } else if (response == 1 && computer == 0) {
                    System.out.println("you win");

                } else if (response == 0 && computer == 2){
                    System.out.println("you win");

                } else if (response == 2 && computer == 0){
                    System.out.println("computer win");

                } else if (response == 1 && computer == 1) {
                    System.out.println("its a draw");

                } else if (response == 1 && computer == 2) {
                    System.out.println("computer wins");

                } else if (response == 2 && computer == 1) {
                    System.out.println("you win");
                }else System.out.println("its a draw");


        }
}








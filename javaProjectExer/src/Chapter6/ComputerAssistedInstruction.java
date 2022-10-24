package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    static SecureRandom randNum = new SecureRandom();
    private static int number1;
    private static int number2;
    private static  int correctResponse;
    private static int incorrectResponse;

    public static void generateQuestion(){
     number1 = 1 + randNum.nextInt(10);
     number2 = 1 + randNum.nextInt(10);

        System.out.println("What is " + number1 + " X " + number2 + "? " + "or press -1 to stop");

    }
    public static void gradeTheAnswer() {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int answer = 0;
        while (answer != -1) {
            answer = input.nextInt();
            if (number1 * number2 != answer && answer != -1) {
                System.out.println(getIncorrectResponses());
                System.out.println("What is " + number1 + " X " + number2 + "? " + "or press -1 to stop");
                incorrectResponse++;
            }
            else if (number1 * number2 == answer && count < 10) {
                System.out.println(getCorrectResponses());
                correctResponse++;
                generateQuestion();
            }
            if (count == 10){
                System.out.println(calculateReport());
                break;
                }
            count++;

        }



    }

    public static String calculateReport() {
        double percentage = ((double) correctResponse / (correctResponse + incorrectResponse))*100;
        if (percentage >= 75){
           return  "Congratulations, na you be the real OG, you are ready to go to the next level";
        }
        else
            return "Please ask your teacher for help";
    }


    public  static String getCorrectResponses(){
            int response = 1 + randNum.nextInt(4);
        return switch (response){

                case 1 ->"Very good";
                case 2 -> "Excellent!";
                case 3 -> "Nice work!";
                default -> "Keep up the good work!";
        };

    }
    public static  String getIncorrectResponses(){
        int response = 1 + randNum.nextInt(4);
        return switch (response){
          case 1 -> "Please try again!";
          case 2 -> "Don't give up, you can do it!";
          case 3 -> "No, keep trying";
            default -> "Wrong, try once more";
        };
    }
}

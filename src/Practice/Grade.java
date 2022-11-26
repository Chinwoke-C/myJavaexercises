package Practice;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double  numberOfGradesEntered = 0;

        while(numberOfGradesEntered < 10){
            System.out.println("Enter a grade or press -1 to exit: ");
            int  scores = scanner.nextInt();
            if (scores == -1){
                break;
            }
            total += scores;
            numberOfGradesEntered ++;
        }
        double average = total / numberOfGradesEntered;
        System.out.println("The average is "+ average);

    }
}

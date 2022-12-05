package Chapter11;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DivisionByZero {
       private static Scanner keyboardInput = new Scanner(System.in);
    public static void main(String... args) {

        while (true) {
            int numerator = input("Enter a numerator");
            int denominator = input("Enter a denominator");
            try {
                display("\n".repeat(50));
                display(("Your integer quotient is" + numerator / denominator));
            } catch (ArithmeticException e) {
                display(e.getMessage());
                main();
            }
        }
    }
    private static int input(String prompt){
            System.out.println(prompt);
            int userInput = 0;
            try{
                return Integer.parseInt(JOptionPane.showInputDialog(prompt));
            }
            catch (NumberFormatException amirah){
            display("Wrong input type");
           return input(prompt);
            }
    }
    public static void display(String prompt){
       JOptionPane.showMessageDialog(null, prompt);
    }
}

package snck;

import java.util.Scanner;

public class FactoRia {
    public static void main(String[] args) {
        long num;
        long factorial = 1L;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        num = input.nextLong();

        for (int i =1; i<=num; i++){
            factorial *= i;
        }
        System.out.println("factorial: " +  factorial);

    }
}

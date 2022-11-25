package Chapter5;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        System.out.println("Enter rate amount");
                int rate = input.nextInt();
        double principal = 1000.0;
        double interest = rate / 100F;
        System.out.printf("%s%20s%20s%n", "Year","Interest", "Amount on deposit");
        for (int year = 1; year <=10 ; year++) {
            double amount = principal * Math.pow(1.0 +interest, year);
            System.out.printf("%4d%20.2f%,20f%n", year,interest, amount);
        }

            }

        }


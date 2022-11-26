package Practice;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Welcome to Our Diary
                Press:
                1. To register
                2. To Login
                3. To exit""");
        int userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println("Welcome to register Page");
                    System.out.println("Please Enter your full name: ");
                    String name = input.nextLine();
                    input.nextLine();
                    System.out.println("Please Enter Your password " + name + ":");
                    String password = input.nextLine();
                    System.out.println("Registration Successful, Welcome on board " + name);
                }
                case 2 -> {
                    System.out.println("Please Enter Your Username: ");
                    String userName = input.nextLine();
                    input.nextLine();
                    System.out.println("Please Enter Your Password: ");
                    String pass = input.nextLine();
                    input.nextLine();
                    System.out.println("Welcome back " + userName);
                }
                case 3 -> {
                    System.out.println("Are You sure you want to exit, 0 or  1");
                    int exit = input.nextInt();

                    if (exit == 0) {
                        System.out.println("""
                                Welcome to Our Diary
                                Press:
                                1. To register
                                2. To Login
                                3. To exit""");
                    }
                    if (exit == 1) {
                        break;
                    }
                }
            }
        }
    }


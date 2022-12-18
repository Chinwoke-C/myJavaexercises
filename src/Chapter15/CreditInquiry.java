package Chapter15;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {
    private final static MenuOption[] choices = MenuOption.values();
      private  static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        MenuOption accountType = getRequest(input);

        switch(accountType){
            case ZERO_BALANCE -> print("Accounts with zero balances");
            case CREDIT_BALANCE -> print("Accounts with credit balances");
            case DEBIT_BALANCE -> print("Accounts with debit balances");
            case END -> print("Thank you for using express inquiry");
        }

    }
    private static MenuOption getRequest(Scanner input) {
        int request = 4;
        print("""
                press 1 for ZERO_BALANCE accounts.
                press 2 for CREDIT_BALANCE accounts.
                press 3 for DEBIT_BALANCE accounts.
                press 4 to TERMINATE.
                """);
        try {
            do {//input user request
                //System.out.printf("%n? ");
                request = input("? ");
            } while (request < 1 || request > 4);

        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Invalid input. Terminating.");
        }

        return choices[request - 1];

    }
    private static void readRecords(MenuOption accountType){
        try(Scanner input = new Scanner(Paths.get("clients.txt"))){
            while (input.hasNext()){
                int accountNumber = input.nextInt();
                String firstName =input.next();
                String lastName = input.next();
                double balance = input.nextDouble();
                // if proper account type, display record
                if (shouldDisplay(accountType, balance)){
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber,
                            firstName, lastName, balance);
                }else {
                    input.nextLine();
                }
            }
        }
        catch (NoSuchElementException | IllegalArgumentException |
                IOException e) {
          System.err.println("Error processing file. Terminating.");
          System.exit(1);
        }
    }

    private static boolean shouldDisplay(MenuOption option, double balance) {
        if ((option == MenuOption.CREDIT_BALANCE) && (balance < 0)){
                return  true;
        } else if ((option==MenuOption.DEBIT_BALANCE) && (balance > 0)) {
            return true;
        } else if ((option==MenuOption.ZERO_BALANCE) &&(balance == 0)) {
            return  true;
        }
        return false;
    }


    private static int input(String prompt) {
        print(prompt);

        return input.nextInt();
    }

    private static void print(String prompt) {
        System.out.println(prompt);

    }

}

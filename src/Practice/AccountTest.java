package Practice;

import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
	Account account1 = new Account("Ore Ayo", 100);
	Account account2 = new Account("Ade John", 500.00);
//initial balance
	displayAccount(account1, account2);

	Scanner input = new Scanner(System.in);

	System.out.print("Enter withdrawal amount for account1: ");
	double withdrawalAmount = input.nextDouble();
	System.out.printf("subtracting %.2f from account1 balance%n%n",
		withdrawalAmount);
	     account1.withdrawal(withdrawalAmount);
//		 updated account1 balance
displayAccount(account1, account2);

	System.out.print("Enter withdrawal amount for account2: ");
	 withdrawalAmount = input.nextDouble();
	System.out.printf("subtracting %.2f to account2 balance%n%n",
		withdrawalAmount);
	account2.withdrawal(withdrawalAmount);


//updated balances for account1 and account2
	displayAccount(account1, account2);
	}

	public static void displayAccount(Account account1, Account account2) {
		System.out.printf("%s balance: $%.2f%n",
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
				account2.getName(), account2.getBalance());

	}
}

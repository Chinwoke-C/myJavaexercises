package Practice;

public class Account {
	private String name; 
	private double balance;

public Account(String name, double balance){
	this.name = name;
	this.balance = balance;	
}

public void withdrawal(double withdrawalAmount){
	if( balance - withdrawalAmount < 0){
		System.out.println(" Only " + balance+ " available, Withdrawal amount exceeded account balance");
	} else {
		this.balance = this.balance - withdrawalAmount;
	
	}
}	
	
public double getBalance(){
	return balance;
}

public void setName(String name){
	this.name = name;
}

public String getName(){
	return name;
	}
}
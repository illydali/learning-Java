package com.demo.oops;

public class AbstractionWithAbstractClassEx {
		
	public static void main(String [] args) {
		
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.displayBankDetails();
		savingsAccount.displayAccountInfo();
		savingsAccount.withdraw();
		
		
	// account = new Account(); 
	// error - cannot instantiate the type Account
		
		Account account = null;
		account = new SavingsAccount();
		account.displayBankDetails();
		account.displayAccountInfo();
		
//		the method withdraw() is undefined for the type Account
//		account.withdraw();
		
	}

}

abstract class Account {
	
	//Abstract classes represent abstract concept of ideas
	//abstract class can have both abstract and concrete methods
	
// abstract method --> no body
	public abstract void displayAccountInfo(); 
	
// concrete methods --> with body
	public void displayBankDetails() {
	System.err.println("Bank of Singapore");
	}
}

// inheriting the abstract class 

class SavingsAccount extends Account {
	// override the abstract method
	
	@Override
	public void displayAccountInfo() {
		System.err.println("Savings Account");
	}
	
	public void withdraw() {
		System.err.println("withdraw some money...");
	}
	
}

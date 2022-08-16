package com.demo.oops;

public class AbstractionWithInterfaceEx {
		
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
		
		System.out.println("--------------------");
		
		
		NetBanking netBanking = new SavingsAccount1();
		netBanking.checkAccountBalance();
		netBanking.displayAccountInfo();
		netBanking.transferMoney();
		
//		netBanking.withdraw(); 
//		The method withdraw() is undefined for the type NetBanking
		
		System.out.println("--------------------");
		
		DebitCard debitCard = new SavingsAccount1();
		debitCard.withdraw();
		debitCard.checkAccountBalance();
		
//		debitCard.transferMoney();
//		The method transferMoney() is undefined for the type DebitCard
		
	}

}

interface NetBanking {
	// can use either syntax..java will understand since
	// this is inside interface 
	
	public abstract void displayAccountInfo();
	abstract void transferMoney();
	public void checkAccountBalance(); 
}

interface DebitCard {
	void withdraw();
	public void checkAccountBalance();
}

// inherit the abstract class
// SavingsAccount is a Account

class SavingsAccount1 implements NetBanking, DebitCard {

	public void withdraw() {
		System.err.println("Withdrawing some moneyyy...");
	}
	
	// overriding the abstract method
	
	@Override 
	public void displayAccountInfo() {
		System.err.println("Type of Account: Savings Account");
	}
	
	@Override
	public void transferMoney() {
		System.err.println("Transferring amount using NetBanking");
	}
	
	@Override
	public void checkAccountBalance() {
		System.err.println("Checking how much is in Savings Account");
	}
}


	
	


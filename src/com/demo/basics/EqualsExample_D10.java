package com.demo.basics;

public class EqualsExample_D10 {
	public static void main(String[] args) {
		
		Integer integer = 10;
		Integer integer2 = 10; 
		System.err.println(integer.equals(integer2));;
		
		Money money = new Money(5);
//		Money money2 = new Money(5); 
		Money money2 = money; // becos not int, it will compare money hence true
		
		
		money.amount = 200; 
		System.out.println(money);
		System.err.println(money2);
		
		System.err.println(money.equals(money2));
		System.err.println(money == money2);
	}

}

class Money {
	int amount;
//	String currencyCode;
//	boolean digital = false; 
//	

	public Money(int amount) {
		super();
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Money [amount= " + amount + "]";
	}
	
}

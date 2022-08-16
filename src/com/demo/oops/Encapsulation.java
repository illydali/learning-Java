package com.demo.oops;

// imagine a capsule pill of medicine 
// the cover hides what is inside, the powder 
// or liquid or whatever it may contain
// similarly, that is what encapsulation is 
// the process of hiding the methods or attributes belonging 
// to a Class

// use case: hiding card number from the rest of the software 

public class Encapsulation {
	public static void main(String[] args) {
		DebitCard1 debitCard = new DebitCard1(); 
		// the field DebitCard.cardNo is not visible
//		debitCard.cardNo; 
		
		System.out.println("Send email: " + debitCard.getCardNo());
		
		debitCard.setCardHolderName("Rambo");
		debitCard.setCardHolderName("Ann");
		System.err.println(debitCard.getCardHolderName());
		
		System.err.println(debitCard);
	}

}



class DebitCard1 {
	// here DebitCard is encapsulated bcos card no is private 
	// and not accessible outside	
	// private fields are called properties
	private String cardNo = "1234123412341234";
	private String pinNo;
	
	// read/write property
	private String cardHolderName; 
	
	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String pCardHolderName) {
		
		if(pCardHolderName.length() > 4 && pCardHolderName.length() < 11) {
			cardHolderName = pCardHolderName;
		} else {
			System.out.println("Name should be 5 to 10 characters");
		}
		
	}

	// say you wanna send email showing last 4 digits
	// write a getter/accessor
	public String getCardNo() {
		return "xxxxxxxxxxxx1234";
	}
	
	// write a setter to accept user input pin no
	// void : since we accepting input, there is no return type 
	
	// (String pPinNo) : since we accepting input, we will need 
	// to define the type of input and set a param 
	
	// setter/mutator / write only property
	public void setPinNo(String pPinNo) {
		pinNo = pPinNo; 
	}
	
	// annotations provide metadata
		@Override // toString is present in the base class (Object class)
		// developer redefining it for new functionality
	public String toString() {
		
		return  getCardNo() + "\t" + cardHolderName;
		 
	}
}


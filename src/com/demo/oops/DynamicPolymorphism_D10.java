package com.demo.oops;

public class DynamicPolymorphism_D10 {

	public static void main(String[] args) {
		
		useInterfaceExample();
//		useClassReferene();
	}

	private static void useInterfaceExample() {
		
//		Dynamic polymorphism
		Book philosopherStoneBook = null;
		
		// null pointer error
//		philosopherStoneBook.viewDetails(); 
		
//		philosopherStoneBook = new  Audiobook();
//		philosopherStoneBook.viewDetails();
//		
//		philosopherStoneBook = new  HardCover();
//		philosopherStoneBook.viewDetails();
		
		if(Math.random() > 0.7) 
			philosopherStoneBook = new  Audiobook();
		else if(Math.random() > 0.3) 
			philosopherStoneBook = new  HardCover();
		else 
			philosopherStoneBook = new  Kindle();
		philosopherStoneBook.setTitle("Developer's stone by Gazal and Ili");
		philosopherStoneBook.viewDetails();
		philosopherStoneBook.getTitle();
	}
	
	private static void useClassReferene() {
		Audiobook philosopherStoneBook = null;
		
		philosopherStoneBook = new  Audiobook();
		philosopherStoneBook.viewDetails();
		philosopherStoneBook.listen();
		philosopherStoneBook.setTitle("Developer's stone by Gazali");
		
		
		HardCover philosopherStone1 = new  HardCover();
		philosopherStone1.viewDetails();
		philosopherStone1.read();
	}
}

abstract class Book {
	
	private String title;
	
	public String get() {
		return title;
	}
	public void setTitle(String titleString) {
		this.title = titleString;
	}
	
	public void getTitle() {
		System.err.println(title);
	}
	
	public abstract void viewDetails();
}

class Audiobook extends Book {
	@Override
	public void viewDetails() {
		System.err.println("Voiced By Jon Snow");
	}
	
	public void listen() {
		System.err.println("Listen with head phoens");
	}
}
	
class HardCover extends Book {
	
	@Override
	public void viewDetails() {
		// TODO Auto-generated method stub
		System.out.println("Printed by Penguin");
	}
	
	public void read() {
		System.out.println("Read slowly");
	}
}

class Kindle extends Book {
	
	@Override
	public void viewDetails() {
		// TODO Auto-generated method stub
		System.out.println("3rd edition for Kindle");
	}
	
	public void Flip() {
		
		
	}
}
package com.demo.oops;

// EVERYTHING IN JAVA IN AN OBJECT

public class ExploreObject {
	public static void main(String[] args) {
		
		Product bookProduct = new Product();
//		
//		String productString = bookProduct.toString();
//		System.err.println(productString);
		
		bookProduct.iSBN = "a12345";
		bookProduct.title = "harry potts";
		bookProduct.author = "jk rowl";
		bookProduct.noOfPages = 300;
		bookProduct.available = true;
//		bookProduct.getDetails();
		
		System.err.println(bookProduct.toString());
		System.err.println(bookProduct);
	}
	

}

//class Product extends Object{
//	
//}

// this line is same as above, by default 

// extends Object class: java.lang.Object
// this is inheritance - so this has all the methods of Object class
class Product {
	
	// variables in classes are automatically assigned default values
	String iSBN; // null
	String title; // null
	String author; // null
	short noOfPages; // 0
	boolean available; // false
	
	String iSBNString;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return "By overriding you can set what you want it to do";
		String objectToString = iSBN + "\n" + title + "\t" + author + "\t" + noOfPages + "\t";
		return objectToString;
		
	}
	
//	public void getDetails() {
//		System.err.println(iSBN);
//		System.err.println(title);
//		System.err.println(author);
//		System.err.println(noOfPages);
//		System.err.println(available);
//	}
	
}
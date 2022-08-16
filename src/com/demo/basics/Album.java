package com.demo.basics;

// creating new class example
public class Album {
	
	
	// static - a variable that belongs to class: 
	// all the objects of the class
	
	// for example all albums can be bought
	// on amazon website
	static String siteString = "Amazon.com";
	
	// fields of the class aka attributes 
	 String singer;
	 String title;
	 String genre;
	 byte totalSongs;
	 String label;
	 boolean available; 
	 char grade;
	 final String SELLER_AGENT = "HMV";
	
	
	// methods aka functions
	 void getAlbum() {
		System.err.println(singer);
		System.err.println(title);
		System.err.println(genre);
		System.err.println(totalSongs);
		System.err.println(label);
		System.err.println(available);
		System.err.println(grade);
	}
	 
	 static void getCompanyName() {
		 System.err.println(siteString);
	 }
	
}

package com.demo.basics;

public class StringConstantPool {
	public static void main(String[] args) {
		stringConstantPool();
	}

	public static void stringConstantPool() {
	String compNameString = "Fictitious company";
	String compName = "Fictitious company"; 
	
	// WRAPPER CLASS byte up to 127 
	Integer integer = 500;
	Integer integer1 = 500;
	System.out.println(integer == integer1); // false
	
	Integer integer2 = 127;
	Integer integer3 = 127;
	System.out.println(integer2 == integer3); //true 
	
	
	
	System.err.println(compName.toString());
	System.err.println(compNameString.toString());
	
	System.out.println(compName.equals(compNameString));
	if (compName == compNameString) {
		System.out.println("same");
	} else 
		System.out.println("no same");
	}
}
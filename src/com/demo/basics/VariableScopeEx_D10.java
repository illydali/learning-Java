package com.demo.basics;

import java.io.NotActiveException;

public class VariableScopeEx_D10 {

	// member variable scope
	
	String tesString;
	
	public static void main(String[] args) {
		
	}
}


class UserDefinedClass {
	
	// method parameter scope
	public static void main(String[] args) {
		
		// local variable scope
		
		String testString2 = null;
		// thelocal variable testString2 may
		// not have been initialized
		
		UserDefinedClass userDefinedClass2;
		
		try {
			System.out.println("exception handling"); 
			
			// exception handler paramenter scope
		} catch (Exception exception) {
			
		}
	}
	
 }
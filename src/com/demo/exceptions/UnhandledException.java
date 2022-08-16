package com.demo.exceptions;

import java.util.Scanner;

// exception: abnormal situation that occurs during execution
public class UnhandledException{
	
	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);

		System.out.println("Welc to calc app");
		
		// example user inputs: 
		
		int num1 = 0;
		int num2 = 200;
		
		// exception occurs at this line
		
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at com.demo.exceptions.UnhandledException.main(UnhandledException.java:15)

		int result = num2/num1;
		
		
		// program shuts down improperly
		// codes below does not get executed
		System.out.println(result);
		System.out.println("Closing calc...");
		
		
	}

}

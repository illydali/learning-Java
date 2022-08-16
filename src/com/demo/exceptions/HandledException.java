package com.demo.exceptions;

public class HandledException {
	public static void main(String[] args) {
		System.err.println("Calculator app");
		
		int num1=0, num2=200; 
		int result = 0; 
		
		try {
			result = num2/num1;
		} 
		catch(ArithmeticException arithmeticException) {
			System.out.println("Cannot be divided by zero");
		}
		
		
		System.err.println(result);
		System.err.println("Shutting down");
	}
}


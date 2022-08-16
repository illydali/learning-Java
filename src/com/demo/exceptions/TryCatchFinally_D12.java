package com.demo.exceptions;

public class TryCatchFinally_D12 {
	public static void main(String[] args) {
		tryCatch();
//		tryFinally();
		tryCatchFinally();
	}
	
	private static void tryCatch() {
		int result = 0, num1 = 100, num2 =10;
//		num2 = 0;
		
		try {
			result = num1/num2;
			Object object = null;
			// null pointer exception
			object.toString();
			System.err.println(result);
		} catch (ArithmeticException e) {
			System.err.println("dont divide by zero");
		}
		// because it is null pointer exception will not be caught
		// hence program will break // will not go into 
		// shutting down the calculator 
		System.err.println("shutting down the calculator");
	}
	
	private static void tryFinally() {
		int result = 0, num1 = 100, num2 =10;
		num2 = 0;
		
		try {
			result = num1/num2;
		} finally {
			System.err.println("shutting down the calculator");
		}
		System.err.println(result);
	}
	
	private static void tryCatchFinally() {
		int result = 0, num1 = 100, num2 =10;
		num2 = 0;
		
		try {
			
			Object object = null;
			// null pointer exception
			object.toString();
			result = num1/num2;
		} catch (NullPointerException nullPointerException){ 
			System.err.println("use new keyword to create new instance");
		} finally {
			System.err.println("shutting down the calculator");
		}
		System.err.println(result);
	}
	
}

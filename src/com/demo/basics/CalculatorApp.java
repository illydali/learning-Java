package com.demo.basics;

public class CalculatorApp {
	public static void main(String[] args) {
		
		// calling or invoking the function aka method
		// this is known as caller
		add(10, 20);
		add(-5, 10);
		add2(2.5f, 2.5f);
		
		
		// fetching the return value
		int result = multiply(10, 10);
		System.out.println(result);
		
		int num[] = {10,5} ;
		subtract(num);
		
		
		// instance method so need to create instance first
		// cannot be called directly like static method
		CalculatorApp calculatorApp = new CalculatorApp();
		calculatorApp.divide(10, 2);
		
	}
	
	// declaring static method(function) here
	// return type void / method name / (params) 
	// called
	static void add(int num1, int num2) {
		if (num1 < 0) {
			System.err.println("Number cannot be negative");
			return;
		}
		System.out.println(num1 + num2);
	}
	
	static void add2(float num1, float num2) {
		System.out.println("two floats " + (num1+ num2));
	}
	
	// return type is return (static with a return type)
	static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	// static no return but with array as params
	static void subtract(int [] numbers) {
		System.out.println(numbers[0]-numbers[1]);
	}
	
	// instance method
	void divide(int num1, int num2) {
		System.out.println("Divide " + (num1 / num2));
	}

}

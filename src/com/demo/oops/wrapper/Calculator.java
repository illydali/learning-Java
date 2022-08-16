package com.demo.oops.wrapper;

public class Calculator {
	
	public static void main(String[] args) {
//		add(2,  3.5f);
		
//		Number number1 = 2;
//		Float number2 = 3.5f;
//		add(number1, number2);;
		
		
		int num1 = 1;
		int num2 = 2;
		
		// boxing : conversion of primitive type to wrapper
		add(num1, num2);
		add(1, 1.1f);
		add(1.1f, 2);
		add(1.1f, 2.1f);
		
	}

	static void add(Number num1, Number num2) {
		
//		System.out.println(num1 instanceof Integer);
//		System.out.println(num2 instanceof Float);
//		System.out.println(num1.intValue() + num2.floatValue());

//		System.out.println(num1.intValue() + num2.floatValue());
		
		if(num1 instanceof Integer && num2 instanceof Integer) {
			System.out.println(num1.intValue() + num2. intValue());
		}
		if(num1 instanceof Integer && num2 instanceof Float) {
			System.out.println(num1.intValue() + num2. floatValue());
		}
		if(num1 instanceof Float && num2 instanceof Integer) {
			System.out.println(num1.floatValue() + num2. intValue());
		}
		if(num1 instanceof Float && num2 instanceof Float) {
			System.out.println(num1.floatValue() + num2. floatValue());
		}
	}
	
}

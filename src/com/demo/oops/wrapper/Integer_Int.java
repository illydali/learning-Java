package com.demo.oops.wrapper;

public class Integer_Int {

	public static void main(String[] args) {
		
		System.out.println(1);
		
		// int 
		int num = 10; 
		System.out.println(num);
		
		
		// old method
//		Integer integer = new Integer(100);
		
		
		// convert primitive to wrapper
		Integer integer = Integer.valueOf(num);
		System.out.println(integer);
		
		
		// convert wrapper to primitive
		int num2 = integer;
		System.out.println(num2);
	}
}

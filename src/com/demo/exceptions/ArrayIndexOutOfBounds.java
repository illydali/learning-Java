package com.demo.exceptions;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		
		
		int numbers[] = {2, 3, 5};
		
//			for(int i=0; i < numbers.length; i++) {
//				System.err.println(numbers[i]);
//			}
		
		System.out.println(numbers[0]);
		try {
		System.out.println(numbers[3]);
				
		}
		catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.err.println("Double Check your index");
		}
		System.out.println(numbers[2]);
		
	}
}


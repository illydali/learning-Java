package com.demo.exceptions;

import java.util.Scanner;

public class TryCatchTest {
	public static void main(String[] args) {
		
		System.err.println("Welcome to Calculator!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		
		try {
			int num1 = scanner.nextInt();
			
			System.out.println("Enter second number");
			int num2 = scanner.nextInt();
			
			int result = num1/num2;
			System.out.println(result);
			
		} catch (Exception e){
			System.err.println("Enter whole numbers only");
			System.out.println(e);
			
		}
		
		scanner.close();
		
	}

}

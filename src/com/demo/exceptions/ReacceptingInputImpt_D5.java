package com.demo.exceptions;

import java.util.Scanner;

public class ReacceptingInputImpt_D5 {
	
	public static void main(String[] args) {
		
		int num1=0, num2=0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		try {
			String num1String = scanner.nextLine();
			num1 = Integer.parseInt(num1String);
			break;
		}
			catch(NumberFormatException numberFormatException) {
				System.err.println("Please enter valid number 1");
				// not needed because we are already scanning 
				// at line 15
//				num1 = Integer.parseInt(scanner.nextLine());
			}
		}
		
		while(true) {
		try {
			String num2String = scanner.nextLine();
			num2 = Integer.parseInt(num2String);
			break;
		} catch (NumberFormatException numberFormatException) {
			System.err.println("Please enter valid number 2");
			
		}
		}
		
		
		System.out.println(num1 + num2);
		scanner.close();
	}
	
}

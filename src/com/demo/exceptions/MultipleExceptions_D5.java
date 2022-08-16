package com.demo.exceptions;

import java.util.Scanner;

public class MultipleExceptions_D5 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 =10; 
//		int num2 = 0;
		
		int values[] = {10,20,30};
		try(Scanner sc = new Scanner(System.in)) {
			String numString = sc.nextLine();
			num1 = Integer.parseInt(numString);
			System.err.println(num1/num2);
			System.err.println(values[3]);
		}
		catch (NumberFormatException numberFormatException) {
 		System.err.println(("Please enter valid number 1 " + numberFormatException.getMessage()));
		}
		catch (ArithmeticException arithmeticException) {
			System.err.println("Cannot divide by zero");
		}
		catch(Exception exception) {
			System.err.println("All exceptions unhandled above");
		}
	}
}

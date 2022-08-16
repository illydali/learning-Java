package com.demo.basics;

public class SwitchCaseExample_Self {
	
	public static void main(String[] args) {
		
		// declare a variable for the switch expression
		
		numSwitch();
		
		monthSwitch();
	}

	private static void monthSwitch() {
		int month = 6;
		String monthString = "";
		
		switch(month) {
		case 1: 
			monthString = "1 = 'January'";
			break;
		case 2: 
			monthString = "2 = 'February'";
			break;
		case 3: 
			monthString = "3 = 'March'";
			break;
		case 4: 
			monthString = "4 = 'April'";
			break;
		case 5: 
			monthString = "5 = 'May'";
			break;
		case 6: 
			monthString = "6 = 'June'";
			break;
		case 7: 
			monthString = "7 = 'July'";
			break;
		default: 
			System.out.println("Month not found, check 8-12");
		}	
		
		System.out.println(monthString);
	}

	private static void numSwitch() {
		int number = 20;
		
		switch(number) {
		
		case 10: 
			System.out.println("Match at number 10");
			break;
		case 15:
			System.out.println("Match at number 15");
			break;
		case 20: 
			System.out.println("Match at number 20");
			break;
		default:
			System.err.println("No match found");
		}
	}

}


package com.demo.basics;

/* 
String - stores text, such as "Hello" - surrounded by double quotes
int - stores integers such as 123 or -123
float - stores floating point numbers such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B' - surrounded by single quotes
boolean - stores true or false
*/ 

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

public class WrapperClasses {
	public static void main(String[] args) {
		
		Byte byteVar = 127;
		Byte byteVar1 = -128;
		Short shortVar = 32767;
		Integer intVar = 2137483647; 
		
		// what is Long datatype? why min/max? 
		
		Long longMax = 9223372036854775807L;
		Long longMin = -9223372036854775808L;
		
		Float floatMax = 3.4028235E38F;
		Double doubleMax = 1.7976931348623157E308D;
		Boolean booleanVar = true;
		Character charVar = 'a';
		
		String carName = "Volvo";
		int myNum = 6;
		
		
// 8 primitives
		System.out.println("Value Of byte Variable is " + byteVar);
		System.out.println("Value Of short Variable is " + shortVar);
		System.out.println("Value Of int Variable is " + intVar);
		System.out.println("Value Of long Variable is " + longMax);
		System.out.println("Value Of float Variable is " + floatMax);
		System.out.println("Value Of double Variable is " + doubleMax);
		System.out.println("Value Of boolean Variable is " + booleanVar);
		System.out.println("Value Of char Variable is " + charVar);		
		
		System.out.println("Value Of String is " + carName);	
		System.out.println("Value Of int is " + myNum);
		
		System.out.println("*********************");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.err.println(Double.MIN_VALUE);
		
		System.out.println("--------------------");
		
		System.err.println(Long.MAX_VALUE);
		
		System.out.println("*********************");
		
		// wrapper classes have conversion functions
		Double double1 = 12345D;
		
//		narrowing primitive conversion.
		Integer integer = double1.intValue();
		System.out.println("Double to Integer : " + integer);
		Byte byte1 = 120;
		
//		widening primitive conversion.
		Integer integer2 = byte1.intValue();
		System.out.println("Byte to Integer " + integer2);
		
		
		String testString = "123.55f";
		Float floatVal = Float.parseFloat(testString);
		System.out.println("String to float : " + floatVal);
		
		
	}

}

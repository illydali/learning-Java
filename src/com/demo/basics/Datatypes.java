package com.demo.basics;

/* 
String - stores text, such as "Hello" - surrounded by double quotes
int - stores integers such as 123 or -123
float - stores floating point numbers such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B' - surrounded by single quotes
boolean - stores true or false
*/ 

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

public class Datatypes {
	public static void main(String[] args) {
//		Type mismatch: cannot convert from int to byte
		// byte byteVar = 128;
		byte byteVar = 127;
		byte byteVar1 = -128;
		short shortVar = 32767;
		int intVar = 2147483647;
//			The literal 9223372036854775807 of type int is out of range 
//			long longVar = 9223372036854775807;
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		float floatMax = 3.4028235E38F;
		double doubleMax = 1.7976931348623157E308D;
		boolean booleanVar = true;
		char charVar = 'a';

// 8 primitives
		System.out.println("Value Of byte Variable is " + byteVar);
		System.out.println("Value Of short Variable is " + shortVar);
		System.out.println("Value Of int Variable is " + intVar);
		System.out.println("Value Of long Variable is " + longMax);
		System.out.println("Value Of float Variable is " + floatMax);
		System.out.println("Value Of double Variable is " + doubleMax);
		System.out.println("Value Of boolean Variable is " + booleanVar);
		System.out.println("Value Of char Variable is " + charVar);
	}

}

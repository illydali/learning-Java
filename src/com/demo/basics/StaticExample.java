package com.demo.basics;


public class StaticExample {
	public static void main(String[] args) {
//		Test test = new Test();
//		test.instanceMethod();
		
		Test.staticMehod();
	}

}

class Test {
	public void instanceMethod() {
		System.err.println("Welcome");
	}
	
	public static void staticMehod() {
		System.err.println("Welcome");
	}
}

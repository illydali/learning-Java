package com.demo.oops;

public class ConstructorChainingEx2 {

	public static void main(String[] args) {
		
//		Derived1 derived1 = new Derived1();
//		// new Derived1();
		
		Son sonny= new Son();
		
	}
}

class Grandfather extends Object{
	
	public Grandfather() {
//		 super();
		System.err.println("Grandpa");
	}
}

class Father extends Grandfather{
	
	public Father() {
//		 super();
		System.err.println("Father");
	}
}


class Son extends Father {
	
	public Son() {
		// super() ->/ Base1()
		// super redirects to Base1 
//		super();
		
		System.err.println("Son");
	}
}

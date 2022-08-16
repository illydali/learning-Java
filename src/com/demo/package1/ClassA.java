package com.demo.package1;

public class ClassA {
	
	// ACCESS SPECIFIERS IN PACKAGES
	// MOST RESTRICTED TO LEAST RESTRICTED 
	// [PRIVATE >> PROTECTED >> DEFAUT >> PUBLIC]
	
	// NOTE default access specifier has no keyword! 
	
	// uncomment to view examples, also uncomment all classes in
	// package1 and package2

	// [PRIVATE]
//	private String s = "test";
//	private void m() {
//		System.out.println("m() " + s);
//	}
//	
//	public static void main(String[] args) {
//		ClassA a = new ClassA();
//		System.out.println(a.s);
//		a.m();
// 	}
	
	// [PROTECTED]
//	protected String s = "test";
//	protected void m() {
//		System.out.println("m() " + s);
//	}
//	
//	public static void main(String[] args) {
//		ClassA a = new ClassA();
//		System.out.println(a.s);
//		a.m();
// 	}
	
	// [PUBLIC] 
//	public String s = "test";
//	public void m() {
//		System.out.println("m() " + s);
//	}
//	
//	static void main(String[] args) {
//		ClassA a = new ClassA();
//		System.out.println(a.s);
//		a.m();
// 	}

	// [DEFAULT: NO KEYWORD NEEDED]
	String s = "test";
	void m() {
		System.out.println("m() " + s);
	}
	
	static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.s);
		a.m();
 	}

}

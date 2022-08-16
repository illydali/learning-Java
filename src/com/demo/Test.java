package com.demo;



public class Test {
	
	public static void main(String[] args) {
		charToString();		
		stringBuilderTest();
		
		Point p = new Point();
		System.out.println("x = " + p.x + ", y = " + p.y);
		
		gfg(null);
		
	}

	private static void stringBuilderTest() {
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		
		System.out.println(s1== s2);
		System.out.println("equals " + s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
	}

	private static void charToString() {
		char[] str = {'i','c','l','u','d','e','h','e','l','p'};
		System.out.println(str.toString());
	}
	
	public static void gfg(String s) {
		System.out.println("String");
	}
	public static void gfg(Object o) {
		System.out.println("Object");
	}
}

class Point {
	protected int x,y; 
	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
	public Point() {
		// TODO Auto-generated constructor stub
	}
}

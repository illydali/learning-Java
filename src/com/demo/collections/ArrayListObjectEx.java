package com.demo.collections;

import java.util.ArrayList;


// Arraylist can hold multiple datatypes 

public class ArrayListObjectEx {

	public static void main(String[] args) {
		
		ArrayList<Object> objectList = new ArrayList<Object>();
		
		objectList.add("WELCOME");
		
		objectList.add(500); 
		
		objectList.add(true);
		
		System.out.println(objectList);
		
		
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Yellow");
		
		// ArrayList methods 
		
//		System.out.println(colors.get(4));
//		System.out.println(colors);
//		System.err.println(colors.size());
//		System.err.println(colors.isEmpty());
//		colors.remove("Blue");
//		System.err.println(colors.size());
//		System.out.println(colors);
//		colors.clear();
//		System.err.println(colors.isEmpty());
//		System.out.println(colors);
		
		
		// equivalent to for each function in javascript 
		
		for (String colorString : colors) {
			System.err.println(colorString);
		}

	}
}

package com.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx_D10 {
	public static void main(String[] args) {
		
		gettingCountryCodes();

	}

	private static void gettingCountryCodes() {
		Map<String, Integer> countryCodeMap = new HashMap<String, Integer>();
		System.err.println(countryCodeMap.isEmpty());
		
		countryCodeMap.put("Singapore", 65);
		countryCodeMap.put("India", 91);
		countryCodeMap.put("Japan", 81);
		countryCodeMap.put("France ".trim(), 33);
		countryCodeMap.put("Japan ".trim(),100); // keys has to be unique: this will
												// overwrite first Japan key
		
		// multiple null values as long as Key is unique
		countryCodeMap.put("Haiti" , null);
		countryCodeMap.put("China" , null);
		countryCodeMap.put("London" , null);
		
		// once key is not unique it takes the last key inserted
		countryCodeMap.put(null, 10);
		countryCodeMap.put(null, 50);
		countryCodeMap.put(null, 200);
		
		System.out.println(countryCodeMap);
		
		System.err.println(countryCodeMap.size());
		
		// search
		
		boolean keyFound = countryCodeMap.containsKey("Singapore");
		if (keyFound) {
			System.err.println("Singapore is in the map");
		}
		else {
			System.err.println("Singapore is not in the map");
		}
		
		// shorthand ternary operator
		String valueFoundString = countryCodeMap.containsValue(65) ? "YA FOUND IT" : "NOTHING HERE"; 
		System.out.println(valueFoundString);
		
		//	shorter
		System.err.println(countryCodeMap.containsValue(65)? "65 found for Singapore" : "65 not found for Singapore");
		countryCodeMap.remove("Japan");
		System.err.println(countryCodeMap);
		countryCodeMap.clear();
		System.err.println(countryCodeMap);
	}
		
		
 }

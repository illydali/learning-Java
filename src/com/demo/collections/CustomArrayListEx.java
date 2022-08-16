package com.demo.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CustomArrayListEx {

	public static void main(String[] args) {
		
	}
}


class UniqueArrayList extends ArrayList<String> {
	
	@Override
	public boolean add(String elementToAdd) {
		
		boolean duplicate = false;
		boolean addSuccess = false;
		
		for (int elementIndex=0; elementIndex<this.size(); elementIndex++) {
			String elementInLiString = this.get(elementIndex);
			if (elementToAdd.equals(elementInLiString)) {
				try {
					duplicate = true;
					Exception duplicateException = new Exception("Duplicate not allowed");
					throw duplicateException;
				}
				catch (Exception duplicateException) {
					System.err.println(duplicateException);
					// TODO: handle exception
					System.err.println(duplicateException.getMessage());
				}
				
			}
		}
		if (!duplicate) {
			addSuccess = super.add(elementToAdd);
		}
		
		return addSuccess;
		
	}
	
}
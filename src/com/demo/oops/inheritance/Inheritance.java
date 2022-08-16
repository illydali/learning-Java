package com.demo.oops.inheritance;

// single
public class Inheritance {

}

class Phone {
	public void dial() {
		System.out.println("Rotating the phone disc");
	}
	public void hearRingTone() {
		
	}
}

class FeaturePhone extends Phone{
	public void dial() {
		System.out.println("Press the keys");
	}
}



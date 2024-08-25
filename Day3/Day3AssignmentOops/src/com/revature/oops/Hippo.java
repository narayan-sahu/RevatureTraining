package com.revature.oops;

public class Hippo implements Animal{

	@Override
	public void makeNoise() {
		System.out.println("Hippo is making noise");
		
	}

	@Override
	public void eat() {
		System.out.print("Hippo is eating");
	}

	@Override
	public void roam() {
		System.out.print("Hippo is Roaming");
		
	}

}

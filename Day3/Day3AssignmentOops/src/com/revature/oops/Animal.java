package com.revature.oops;

public interface Animal {    
	public abstract void makeNoise();
	public abstract void eat();
	
	default void sleep() {
		System.out.print("Animal is Sleeping");
	}
	
	default void roam() {
		System.out.print("Animal Is Roaming");
	}
}

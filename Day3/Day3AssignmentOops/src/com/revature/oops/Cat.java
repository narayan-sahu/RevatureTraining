package com.revature.oops;

public class Cat extends Feline{

	@Override
	public void makeNoise() {
		System.out.print("Cat meow meow");
	}

	@Override
	public void eat() {
		System.out.print("Cat is Eating");
	}

}

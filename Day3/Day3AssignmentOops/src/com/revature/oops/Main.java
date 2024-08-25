package com.revature.oops;

public class Main {
	
	public static void main(String[] args) {
		Animal animal[]= {new Dog(),new Cat(),new Hippo(),new Wolf(),new Lion(),new Tiger()};

		for(Animal a:animal)
		{
			a.eat();
			a.makeNoise();
			a.sleep();
			a.roam();
			System.out.println("-------------");
		}
	}
	
}

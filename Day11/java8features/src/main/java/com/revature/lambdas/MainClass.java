package com.revature.lambdas;

public class MainClass {
public static void main(String[] args) {
	/*
	 * SayName name=new SayName(); System.out.println(name.sayHello());
	 */
	
	/*
	 * Say say=()->{return "Hello Lambdas";};
	 * 
	 * System.out.println(say.sayHello());
	 */

	/*
	 * Say say=name-> "Hello "+name; System.out.println(say.sayHello("Sanskruti"));
	 */
	Say say=(fname,lname)->{
		String name=fname.toUpperCase()+ " "+lname.toUpperCase();
		return name;
	};
	System.out.println(say.sayHello("Manjeet", "Rai"));
}
}
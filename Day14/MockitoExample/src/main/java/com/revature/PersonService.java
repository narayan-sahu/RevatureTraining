package com.revature;

import java.util.Collections;
import java.util.List;

public class PersonService {
	
	/*
	 * The repository field is a dependency of the service class. This means that
	 * our service class depends on this field for something. Dependencies aren't
	 * necessarily a bad thing are required sometimes. Even so, dependencies can make
	 * testing an application trickier, particularly unit testing.
	 *
	 * Recall that a unit test should be a minimal test focusing on one and
	 * only component. We want to test the smallest unit that we possibly can
	 * test.
	 *
	 * Layman's Terms: When you run a unit test, you should know exactly which
	 * component is failing. If you do not, you probably could write a better
	 * test.
	 */
	
	private PersonRepository repository;
	
	public PersonService() {
		this.repository=new PersonRepository();
	}
	
	public List<String> sort(){
		System.out.println("Person Service: sort()");
		List<String> user=this.repository.findAll();
		Collections.sort(user);
		return user;
	} 

}

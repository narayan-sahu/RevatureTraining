package com.revature;

import java.util.Arrays;
import java.util.List;

public class PersonRepo {
	
	public List<String> findAll()
	{
		System.out.println("Person Repo findAll()");
		return Arrays.asList("Madhav","Vardhan","Alex","Sudeep");
	}

}

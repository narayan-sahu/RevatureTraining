package com.revature;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCode {
	
	public PersonService pService;
	
	@Test
	public void testSort() {
		this.pService=new PersonService();
		List<String> sort = this.pService.sort();
		System.out.print(sort);
		Assertions.assertEquals("Madhav", sort.get(1));
	}

}

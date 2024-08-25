package com.revature;

import static org.mockito.Mockito.times;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class PersonMockTest {

	/*
	 * If we want to test the "Service" class, we will need an instance of it. This
	 * is referred to as our "Object Under Test".
	 *
	 * We have to tell Mockito that there is a relationship between our mock(s) and
	 * our object under test. As such, we can use the @InjectMocks annotation.
	 */
	
	@InjectMocks
	public PersonService pservice;

	/*
	 * The first step to mocking is determining what exactly needs to be mocked. In
	 * general, we want to mock our object under test's dependencies. In this case,
	 * our object under test only has one dependency: a dependency of type
	 * Repository. Note that Mockito can inject this mock for us if we instruct it
	 * to.
	 */

	@Mock
	public PersonRepo repo;
	
	@BeforeEach
	public void setUp(){
	    MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void unitTest() {
		/*
         * Before we call the sort() method, perhaps we should define some dummy
         * data (stub) that will be returned when findAll is called. We can do
         * this using the "Mockito" utility which allows for easy stubbing and
         * behavior verification (verifying that the code behaves as expected meaning
         * that methods are called when they should be or the number of times that they
         * should be).
         */
		Mockito.when(this.repo.findAll()).thenReturn(Arrays.asList("Madhav","Vardhan","Sudeep","Asmit"));
		List<String> sort = this.pservice.sort();
//		Mockito.verify(this.repo, times(1)).findAll();
		
        System.out.println(sort);
        Assertions.assertEquals("Madhav", sort.get(1));

	}

}

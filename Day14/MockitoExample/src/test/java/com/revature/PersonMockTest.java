package com.revature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.times;

public class PersonMockTest {
    /*
     * If we want to test the "Service" class, we will need an instance of it.
     * This is referred to as our "Object Under Test".
     *
     * We have to tell Mockito that there is a relationship between our mock(s)
     * and our object under test.
     * As such, we can use the @InjectMocks annotation.
     */
    @InjectMocks
    public PersonService service;

    /*
     * The first step to mocking is determining what exactly needs to be mocked.
     * In general, we want to mock our object under test's dependencies. In this
     * case, our object under test only has one dependency: a dependency of type
     * Repository. Note that Mockito can inject this mock for us if we instruct
     * it to.
     */
    @Mock
    public PersonRepository repository;

@BeforeEach
public void setUp(){
    MockitoAnnotations.openMocks(this);
}

    @Test
    public void unitTestSort(){
        /*
         * Before we call the sort() method, perhaps we should define some dummy
         * data (stub) that will be returned when findAll is called. We can do
         * this using the "Mockito" utility which allows for easy stubbing and
         * behavior verification (verifying that the code behaves as expected meaning
         * that methods are called when they should be or the number of times that they
         * should be).
         */
        Mockito.when(this.repository.findAll()).thenReturn(
                Arrays.asList("Pratik", "Raghav", "Prathmesh", "Sudeep"));
        List<String> sortedNames=this.service.sort();
        //Example of behavior verification with Mockito.
        Mockito.verify(this.repository, times(1)).findAll();
        System.out.println(sortedNames);
    }
}

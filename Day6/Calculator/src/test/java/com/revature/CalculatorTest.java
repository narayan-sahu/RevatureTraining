package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import calculator.Calculator;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
	
	static Calculator c=null;
	int input1=0;
	int input2=0;
	int result=0;
	
	@Test
	@DisplayName("Positive Test Case")
	@Order(1)
	public void testSumPositive()
	{
		result=c.sum(input1, input2);
		System.out.println("\ntestSumPositive");
		Assertions.assertEquals(30, result);
	}
	
	@Test
	@DisplayName("Negative Test Case")
	@Order(2)
	public void testSumNegative()
	{
		result=c.sum(input1, input2);
		System.out.println("\ntestSumNegative");
		Assertions.assertNotEquals(20, result);
	}
	
	@Test
	public void testMultiply() {
		result=c.multiply(input2, input1);
		System.out.print("\nTest Mulitply");
		Assertions.assertEquals(200, result);
	}
	
	@Test
    @DisplayName("Test Division")
    @Order(4)
    public void testDivide() {
        result = c.divide(input1, input2);
        System.out.println("testDivide");
        assertEquals(0, result); // 10/20 = 0 in integer division
    }
	
	@Test
    @DisplayName("Test Division by Zero")
    @Order(5)
    public void testDivideByZero() {
        input2 = 0;
        System.out.println("testDivideByZero");
        assertThrows(ArithmeticException.class, () -> c.divide(input1, input2));
    }
	
	@BeforeEach
	public void beforeEachMethod()
	{
		input1=10;
		input2=20;
		System.out.println("Before Each ....");
	}
	
	
	@AfterEach
	public void afterEachMethod()
	{
		result=0;
		System.out.println("After Each Method");
	}
	
	//BeforeAll & AfterAll
	@BeforeAll
	public static void beforeAll()
	{
		c=new Calculator();
		System.out.println("Before All");
	}
	
	@AfterAll
	public static void afterAll()
	{
		c=null;
		System.out.println("After All");
	}
}

package com.revature.exception;
public class FlowOfCode 
{
    public static void main(String[] args) 
    {
        System.out.println("Starting program");
        try {
            System.out.println("Starting try block");
            System.exit(0);
            int result = 10 / 0; 
            System.out.println("This line will not be executed due to exception");
        } catch (ArithmeticException e) {
            System.out.println("Starting catch block");
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Starting finally block");
            System.out.println("GoodBye!!!!!!!!!!!!");
        }

        System.out.println("Ending program");
    }
}

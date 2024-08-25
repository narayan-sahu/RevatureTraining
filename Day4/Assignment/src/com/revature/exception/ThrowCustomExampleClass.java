package com.revature.exception;

public class ThrowCustomExampleClass 
{
    private int value;

    public ThrowCustomExampleClass(int value) {
        this.value = value;
    }

    public void checkValue() throws ThrowCustomException {
        if (value < 0) {
            throw new ThrowCustomException("Value cannot be negative!");
        }
    }

    public static void main(String[] args) {
        try {
        	ThrowCustomExampleClass example = new ThrowCustomExampleClass(-8);
            example.checkValue();
        } catch (ThrowCustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Okk");
    }
}


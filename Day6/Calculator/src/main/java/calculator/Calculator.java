package calculator;

public class Calculator {
	
	public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.print("Sum is :"+c.sum(10,20));
	}
}

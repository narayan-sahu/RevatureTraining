package Questions;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("You entered:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}

package Questions;

import java.util.Scanner;

public class ArraySumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int sum = 0;
        int product = 1;

        System.out.println("Please enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            sum += numbers[i];
            product *= numbers[i];
        }

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

        scanner.close();
    }
}

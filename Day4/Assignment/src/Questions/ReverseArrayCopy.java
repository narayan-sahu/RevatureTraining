package Questions;

import java.util.Scanner;

public class ReverseArrayCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = new int[10];
        int[] reversedArray = new int[10];

        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < originalArray.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        System.out.println("Original array:");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();

        System.out.println("Reversed array:");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

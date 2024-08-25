package Questions;

import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Please enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int smallest = array[0];
        int largest = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);

        scanner.close();
    }
}

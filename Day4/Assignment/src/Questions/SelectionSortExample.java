package Questions;

import java.util.Scanner;

public class SelectionSortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Initialize the array with the specified size
        int[] array = new int[size];

        // Input elements for the array from the user
        System.out.println("Please enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Perform selection sort
        selectionSort(array);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }

    // Selection sort algorithm
    public static void selectionSort(int[] array) {
        int size = array.length;

        // Iterate over each element in the array
        for (int i = 0; i < size - 1; i++) {
            // Assume the minimum is the current element
            int minIndex = i;

            // Find the index of the smallest element in the remaining unsorted part
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }

            // Print array after each iteration to show progress
            System.out.println("Array after iteration " + (i + 1) + ":");
            for (int k = 0; k < size; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }
}

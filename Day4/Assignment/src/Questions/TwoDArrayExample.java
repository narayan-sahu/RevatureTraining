package Questions;

import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

      System.out.println("Please enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  
        }

        scanner.close();
    }
}

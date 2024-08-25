package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMinDifference {
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

        Arrays.sort(array);

        int minDiff = array[1] - array[0];
        int minPairFirst = array[0];
        int minPairSecond = array[1];

        int maxDiff = array[size - 1] - array[0];
        int maxPairFirst = array[0];
        int maxPairSecond = array[size - 1];

        System.out.println("Pair with the minimum difference: (" + minPairFirst + ", " + minPairSecond + ")");
        System.out.println("Minimum difference: " + minDiff);

        System.out.println("Pair with the maximum difference: (" + maxPairFirst + ", " + maxPairSecond + ")");
        System.out.println("Maximum difference: " + maxDiff);

        scanner.close();
    }
}

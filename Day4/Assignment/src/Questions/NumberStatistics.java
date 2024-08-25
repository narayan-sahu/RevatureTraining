package Questions;

import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];

        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        System.out.println("Please enter 20 integers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            }

            if (numbers[i] == 0) {
                zeroCount++;
            } else if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of zeros: " + zeroCount);

        scanner.close();
    }
}

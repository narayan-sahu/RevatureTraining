package Questions;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int h=0;

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
        
        System.out.println("Enter the number to find:");
        int k=scanner.nextInt();
        for (int i = 0; i < numbers.length; i++) 
        {
            if(numbers[i]==k)
            {
                h=1;
            }
        }
        if(h==1)
        {
        	System.out.println("Present");
        }else {
        	System.out.println("Not Present");
        }
        scanner.close();
    }
}

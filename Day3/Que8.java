//7. Write a program to find greatest common divisor (GCD) or 
//highest common factor (HCF) of given two numbers

import java.util.Scanner;

public class Que8 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.print("Enter Number 1:");
		int a = sn.nextInt();

		System.out.print("Enter Number 2:");
		int b = sn.nextInt();

		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}
		System.out.print(a+" is GCD");
	}
	
	/**
	 * int maxnumber = Math.max(a, b);

		for (int i = maxnumber; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 0;
	 * */

}

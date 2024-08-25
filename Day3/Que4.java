//4. Take 10 integers from keyboard using loop and print their average value on the screen.

import java.util.Scanner;

public class Que4 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			System.out.print("Enter Number "+i+" :");
			int num=sn.nextInt();
			sum+=num;
		}
		
		System.out.print("Average of All These Number is :"+(sum/10));
	}
}

//6. Take integer inputs from user until he/she presses 
//q ( Ask to press q to quit after every integer input ). 
// Print average and product of all numbers.

import java.util.Scanner;

public class Que7 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int sum=0;
		int n;
		int count=0;
		int product=1;
		System.out.print("Enter Number and type q when you want to stop :");
		while(true)
		{
			String str=sn.nextLine();
			if(str.equalsIgnoreCase("q"))
			{
				break;
			}
			try {
			sum+=Integer.parseInt(str);
			product*=Integer.parseInt(str);
			count++;
			}catch(Exception e)
			{
				System.out.print("\nOnly Number or q is accepted nothing else");
			}
			
		}
		
		System.out.print("Average is :"+(sum/count));
		System.out.print("\nProduct is :"+product);
	}
}

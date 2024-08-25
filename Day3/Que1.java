//1. Take values of length and breadth of a rectangle from user
//and check if it is square or not.

import java.util.Scanner;

public class Que1 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		double length=sn.nextDouble();
		double breadth=sn.nextDouble();
		
		if(length==breadth)
		{
			System.out.print("It is a Square");
		}
		else
		{
			System.out.print("It is not a square");
		}
		
	}
}

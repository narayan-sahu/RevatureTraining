package tasks;

import java.util.Scanner;

//2. Write a program that takes your full name as input and
//displays the abbreviations of the first and middle names except the last name
//which is displayed as it is. For example, if your name is Robert
//Brett Roser, then the output should be R.B.Roser.

public class Que2 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String str=sn.nextLine();
		
		String[] arr=str.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			if(i==arr.length-1)
			{
				sb.append(arr[i]);
				break;
			}
			sb.append(arr[i].charAt(0)).append(".");
			
		}
		System.out.print(sb.toString());
				
	}
}

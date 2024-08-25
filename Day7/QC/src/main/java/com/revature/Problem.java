package com.revature;
import java.util.*;

public class Problem {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Reversing"+" a:"+a+" :b"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Reversing"+" a:"+a+" :b"+b);
		sc.close();
	}
}

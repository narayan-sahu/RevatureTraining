package com.revature;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
	
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<>();
		arr.add("IronMan");
		arr.add("Black Panther");
		arr.add("Hulk");
		arr.add("Thor");
		arr.add("Captian America");
		
		for(String n:arr)
		{
			System.out.println(n);
		}
		
		Collections.sort(arr);
		
		System.out.println("\n----------Sorted--------------");
		for(String n:arr)
		{
			System.out.println(n);
		}
		
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println("\n----------Reverse Sorted--------------");
		for(String n:arr)
		{
			System.out.println(n);
		}
		
		
		
	}

}

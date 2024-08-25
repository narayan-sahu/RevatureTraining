package com.revature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
	public static void main(String[] args) {
		
		List<String> arr=new ArrayList<>();
		arr.add("Vardan");
		arr.add("Madhav");
		arr.add("Sudeep");
		arr.add("Asmit");
		arr.add("Jayesh");
		
		arr.remove("JAyesh");
		
		
		
		ListIterator<String> itr = arr.listIterator(arr.size());
		while(itr.hasPrevious())
		{
			System.out.println(""+itr.previous());
		}
//		
		System.out.println("\n------------NEW------------------");
		Iterator<String> itr1=arr.iterator();
		while(itr1.hasNext())
		{
			System.out.println(""+itr1.next());
		}
		
		System.out.println("\n------------NEW------------------");
		for(String a:arr)
		{
			System.out.println(a);
		}
		
	}
}

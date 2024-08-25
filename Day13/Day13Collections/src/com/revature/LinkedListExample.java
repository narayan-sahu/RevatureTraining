package com.revature;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Vardan");
		ll.add("Madhav");
		ll.add("Sudeep");
		ll.add("Asmit");
		ll.add("Jayesh");
		
		System.out.println("Before Removing Jayesh :"+ll);
		
		ll.remove("Jayesh");
		System.out.println("After Removing Jayesh :"+ll);
		
		ll.set(0, "Vardhan");
		System.out.println("After Updating Vardan :"+ll);
		
		ll.addFirst("Abhijet");
		System.out.println("After Ading First:"+ll);
		
		ll.addLast("Shubham");
		System.out.println("After Ading Last:"+ll);
		
		Iterator<String> descendingIterator = ll.descendingIterator();
		System.out.print("Decending Iterator :");
		while(descendingIterator.hasNext())
		{
			System.out.print(" "+descendingIterator.next());
		}
		
		
		
		
	}
}

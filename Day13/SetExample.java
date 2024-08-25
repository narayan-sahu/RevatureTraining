package com.revature;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> hm=new HashSet<>();
//		Set<Integer> hm=new LinkedHashSet<>();
//		Set<Integer> hm=new TreeSet<>();
		
		hm.add(5);
		hm.add(8);
		hm.add(2);
		hm.add(1);
		hm.add(6);
		hm.add(3);
		hm.add(6);
		
		Iterator<Integer> itr=hm.iterator();
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
	}

}

package com.revature;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1, "Madhav");
		map.put(2, "Vardhan");
		map.put(3, "Asmit");
		map.put(4, "Jayesh");
		map.put(5, "Sudeep");
		
		Set<Integer> keys=map.keySet();
		for(Integer k:keys)
		{
			System.out.println("Key: "+k+" Value:"+map.get(k));
		}
		
		Set<Integer> keySet = map.keySet();
		Collection<String> values = map.values();
		
		System.out.print(keySet);
		System.out.print(values);
		
		for(Map.Entry<Integer,String> s :map.entrySet())
		{
			System.out.println("Key:"+s.getKey() +" Value :"+s.getValue());
		}
	}
}

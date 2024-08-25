package com.revature.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemo {
public static void main(String[] args) {
	
	List<String> names=new ArrayList();
	names.add("Aashlesha");
	names.add("Asmit");
	names.add("Sudeep");
	names.add("Prince");
	names.add("Raghav");
	
	/*
	 * for(String name:names) System.out.println(name);
	 */
	
	
	//names.stream().forEach(name->System.out.println(name));
	
	//names.stream().filter((n->n.startsWith("P"))).forEach(n->System.out.println(n));
	names.stream().filter((n->n.startsWith("S"))).forEach(System.out::println);
	
	names.stream().map(n->n.toUpperCase()).forEach(System.out::println);
}
}
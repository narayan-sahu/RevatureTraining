package com.revature.compareEmployee;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {
	public static void main(String[] args) {
		ArrayList<Employee> arr=new ArrayList<>();
		
	
		arr.add(new Employee(2,"Vardan",650000));
		arr.add(new Employee(3,"Sudeep",5000));
		arr.add(new Employee(4,"Asmit",8000));
		arr.add(new Employee(1,"Madhav",5044000));
		
		Collections.sort(arr);
		
		for(Employee e:arr)
		{
			System.out.println(e);
		}
		
		System.out.println("\n-----------After Comparator-------------");
		EmployeeComparator e=new EmployeeComparator();
		Collections.sort(arr,e);
		for(Employee em:arr)
		{
			System.out.println(em);
		}
	}
}

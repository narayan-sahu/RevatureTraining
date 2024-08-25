package com.revature.compareEmployee;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
//		{
//			return -1;
//		}
//		
//		if(o1.getSalary()>o2.getSalary())
//		{
//			return 1;
//		}
//		
//		else return 0;
	}

}

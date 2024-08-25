package com.revature.emp;

public class ContractualEmployee extends Employee{

	
	public ContractualEmployee() {
		super();
	}

	public ContractualEmployee(int empId, String empName, int daysPresent) {
		super(empId, empName, daysPresent);
	}

	@Override
	public double calculateSalary(int daysPresent)
	{
		return 2000*daysPresent;
	}
}

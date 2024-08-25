package com.revature.emp;

public class SalariedEmployee extends Employee implements EmployeeBenifits{

	
	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(int empId, String empName, int daysPresent) {
		super(empId, empName, daysPresent);
	}

	@Override
	public double calculateSalary(int daysPresent)
	{
		return 2000*daysPresent;
	}

	@Override
	public String getBenifits() {
		return "Mediacal,Food,HRA";
	}

	

}

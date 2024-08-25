package com.revature.emp;

public class EmployeeSalary {
	public static void main(String[] args) {
		System.out.println("Employee Management");
		
		SalariedEmployee s1=new SalariedEmployee();
		s1.setEmpId(1);
		s1.setEmpName("Maddy");
		s1.setDaysPresent(20);
		
		System.out.print(s1+" and Salary is "+s1.calculateSalary(s1.getDaysPresent()));
		System.out.print(" "+s1.getBenifits());
		
		ContractualEmployee c1=new ContractualEmployee(2,"Maddy2",20);
		System.out.print("\n"+c1+" and Salary is "+s1.calculateSalary(c1.getDaysPresent()));
		
	}
}

package com.revature.emp;

public abstract class Employee {

	private int empId;
	private String empName;
	private int daysPresent;

	public abstract double calculateSalary(int daysPresent);
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDaysPresent() {
		return daysPresent;
	}

	public void setDaysPresent(int daysPresent) {
		this.daysPresent = daysPresent;
	}

	public Employee(int empId, String empName, int daysPresent) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.daysPresent = daysPresent;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", daysPresent=" + daysPresent + "]";
	}

}

package com.revature.compareEmployee;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private long salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getSalary() {
		return salary;
	}

	public Employee() {
		super();
	}

	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}

}

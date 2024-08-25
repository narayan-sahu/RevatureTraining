package com.revature.bank;

public abstract class Account implements InterestRateProvider{

	private final long accountNumber;
	private String name;
	private String IFSCCODE;
	private int age;
	
//	public abstract String intrestRate();

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIFSCCODE() {
		return IFSCCODE;
	}

	public void setIFSCCODE(String iFSCCODE) {
		IFSCCODE = iFSCCODE;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Account(long accountNumber, String name, String iFSCCODE, int age) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		IFSCCODE = iFSCCODE;
		this.age = age;
	}
	
	public Account(long accountNumber) {
		super();
		this.accountNumber=accountNumber;
	}

	public Account() {
		super();
		this.accountNumber=0;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", IFSCCODE=" + IFSCCODE + ", age=" + age
				+ "]";
	}
	
	

	
	
	

}

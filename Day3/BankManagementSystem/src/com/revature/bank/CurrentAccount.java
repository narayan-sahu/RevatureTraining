package com.revature.bank;

public class CurrentAccount extends Account{

	
	
	public CurrentAccount() {
		super();
	}

	public CurrentAccount(long accountNumber, String name, String iFSCCODE, int age) {
		super(accountNumber, name, iFSCCODE, age);
	}

	public CurrentAccount(long accountNumber) {
		super(accountNumber);
	}

	@Override
	public String interestRate() {
		return "40%";
	}
	
}

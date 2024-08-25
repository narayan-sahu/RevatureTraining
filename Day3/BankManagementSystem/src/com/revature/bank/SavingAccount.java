package com.revature.bank;

public class SavingAccount extends Account{

	
	public SavingAccount() {
		super();
	}

	public SavingAccount(long accountNumber, String name, String iFSCCODE, int age) {
		super(accountNumber, name, iFSCCODE, age);
	}

	public SavingAccount(long accountNumber) {
		super(accountNumber);
	}

	@Override
	public String interestRate() {
		return "30%";
	}
	
}

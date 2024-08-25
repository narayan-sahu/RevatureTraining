package com.revature.bank;

public class Bank {
	public static void main(String[] args) {
		
		SavingAccount s1=new SavingAccount(12345);
		s1.setAge(20);
		s1.setIFSCCODE("UBIN0555011");
		s1.setName("Maddy");
		
		System.out.print(s1+""+s1.interestRate());

		CurrentAccount c1=new CurrentAccount(54321);
		c1.setAge(22);
		c1.setIFSCCODE("PAYTM01234");
		c1.setName("Vardan");
		System.out.print("\n"+c1+""+c1.interestRate());
	}

}

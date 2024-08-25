package com.revature.runnable;

public class TestThread {
	public static void main(String[] args) {
		RunnableDemo r1=new RunnableDemo("T1"); 
		Thread t1=new Thread(r1);
		t1.start();
		
		RunnableDemo r2=new RunnableDemo("T2"); 
		Thread t2=new Thread(r2);
		t2.start();
		
		RunnableDemo r3=new RunnableDemo("T3");
		r3.start();
	}

}

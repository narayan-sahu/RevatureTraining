package com.revature.runnable;

public class TestRunnable {
	public static void main(String[] args) {
		RunnableExample r1=new RunnableExample("Thread 1");
		Thread t1=new Thread(r1);
		t1.start();
		
		RunnableExample r2=new RunnableExample("Thread 2");
		Thread t2=new Thread(r2);
		t2.start();
	}
}

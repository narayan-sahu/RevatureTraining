package com.revature.runnable;

public class TestThread {
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo("Thread 1");
		t1.start();   //started or runnable
		//t1.run() will be normal call
		ThreadDemo t2=new ThreadDemo("Thread 2");
		t2.start();
	}
}

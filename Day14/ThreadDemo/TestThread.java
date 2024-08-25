package com.revature;

public class TestThread {
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo("Thread1");
		t1.start();
		
		ThreadDemo t2=new ThreadDemo("Thread2");
		t2.start();
	}

}

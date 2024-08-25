package com.revature;

public class ThreadDemo extends Thread{

	private Thread t;
	private String threadName;
	
	ThreadDemo(String name)
	{
		this.threadName=name;
		System.out.println("Creating Thread with name:"+threadName);
	}
	
	@Override
	public void run() {
		System.out.println("Running :"+threadName);
		try {
			for(int i=4;i>0;i--)
			{
				System.out.println("Thread :"+threadName +" :"+ i);
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			System.out.println("Thread "+threadName+" is Interrupted");
		}
		System.out.println("Thread :"+threadName+" Exiting");
	}
}

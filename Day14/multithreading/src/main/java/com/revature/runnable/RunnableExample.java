package com.revature.runnable;

public class RunnableExample implements Runnable {
	private Thread t;
	private String threadName;
	RunnableExample (String name)
	{
		threadName =name;
		System.out.println("Creating "+threadName);
	}
	
	public void run()
	{
		System.out.println("Running "+threadName);
		try {
			for(int i=4;i>0;i--)
			{
				System.out.println("Thread "+threadName+","+i+" "+new java.util.Date());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Thread "+threadName+" interrupted");
		}
		System.out.println("Thread"+threadName+" exiting...");
	}
}

package com.revature.runnable;

public class RunnableDemo implements Runnable{

	private Thread t;
	private String threadName;
	
	RunnableDemo(String name)
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
	
	public void start() {
		System.out.print("Stating With Thread:"+threadName);
		if(t==null)
		{
			t=new Thread(this,threadName);
			t.start();
		}
	}
}

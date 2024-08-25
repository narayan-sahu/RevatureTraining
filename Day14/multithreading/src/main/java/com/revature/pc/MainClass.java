package com.revature.pc;

public class MainClass {
	public static void main(String args[]) 
    { 
        // Initially, there needs to be some data 
        // in order to consume the data. So, 
        // Producer object is created first 
        Producer p = new Producer(); 
  
        // Sending this producer object 
        // into the consumer 
        Consumer c = new Consumer(p); 
        Thread t1 = new Thread(p); 
        Thread t2 = new Thread(c); 
  
        // Since from the producer object, 
        // we have already produced the data. 
        // So, we start by consuming it. 
        t2.start(); 
        t1.start(); 
    } 
}

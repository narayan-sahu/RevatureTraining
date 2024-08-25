package com.revature.deadlock;

public class DeadLockTest {
	public static void main(String[] args) {
		new Thread(new ThreadOne(), "ThreadOne").start();
		new Thread(new ThreadTwo(), "ThreadTwo").start();
	}
}

class ThreadOne implements Runnable {

	public void run() {
		synchronized (Integer.class) {
			System.out.println(Thread.currentThread().getName() + " - Got lock on Integer.class");

			synchronized (String.class) {
				System.out.println(Thread.currentThread().getName() + " - Got lock on String.class");
			}
		}
	}
}

class ThreadTwo implements Runnable {

	public void run() {
		//synchronized (String.class) {
			 synchronized (Integer.class) {
			System.out.println(Thread.currentThread().getName() + " - Got lock on String.class");
			//synchronized (Integer.class) {
				synchronized (String.class) {
				System.out.println(Thread.currentThread().getName() + " - Got lock on Integer.class");
			}
		}

	}
}

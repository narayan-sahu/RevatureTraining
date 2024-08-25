package com.revature.synchronization;

class PrintDemo {
	   public void printCount() {
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter   ---   "  + i );
	            Thread.sleep(50);
	         }
	      } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	      }
	 }
}

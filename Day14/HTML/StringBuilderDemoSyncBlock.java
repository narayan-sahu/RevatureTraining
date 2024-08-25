package com.revature.StringDemo;

public class StringBuilderDemo extends Thread {
    private static StringBuilder str = new StringBuilder();

    public void run() {
    	synchronized (str) {
    		for (int i = 0; i < 1000; i++) {
                str.append("a");
            }
		}
        
    }

    public static void main(String[] args) {
        StringBuilderDemo t1 = new StringBuilderDemo();
        StringBuilderDemo t2 = new StringBuilderDemo();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Length of StringBuilder: " + str.length());
    }
}

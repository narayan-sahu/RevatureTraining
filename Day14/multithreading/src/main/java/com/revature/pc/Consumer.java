package com.revature.pc;

class Consumer extends Thread { 
	  
    // Creating the object of the 
    // producer class 
    Producer p; 
  
    // Assigning the object of the 
    // producer class 
    Consumer(Producer temp) 
    { 
        p = temp; 
    } 
  
    // Overriding the run method 
    public void run() 
    { 
  
        // Controlling the access of the 
        // buffer to the shared producer 
        synchronized (p.buffer) 
        { 
            try { 
               p.buffer.wait(); 
           } 
            catch (Exception e) { 
                e.printStackTrace(); 
            } 
  
            // Printing the values of the string buffer 
            // and consuming the buffer 
            for (int i = 0; i < 4; i++) { 
                System.out.print(p.buffer.charAt(i) + " "); 
            } 
            System.out.println("\nBuffer is Empty"); 
        } 
    } 
}

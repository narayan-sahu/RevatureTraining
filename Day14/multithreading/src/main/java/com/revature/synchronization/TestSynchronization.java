package com.revature.synchronization;

class Table{  
	 synchronized void printTable(int n)
	 {//synchronized method  
		// void printTable(int n){
		 for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	class FivesTable extends Thread{  
		Table t;  
		FivesTable(Table t)
		{  
				this.t=t;  
		}  
		public void run()
		{  
			t.printTable(5);  
		}  
	  
	}  
	
	class HundredsTable extends Thread{  
		Table t;  
		HundredsTable(Table t)
		{  
			this.t=t;  
		}
		
		public void run()
		{  
			t.printTable(100);  
		}  
	}  
	  
	public class TestSynchronization
	{  
		public static void main(String args[])
		{  
			Table obj = new Table();//only one object  
			FivesTable t1=new FivesTable(obj);  
			HundredsTable t2=new HundredsTable(obj);  
			t1.start();  
			t2.start();  
		}  
	}  
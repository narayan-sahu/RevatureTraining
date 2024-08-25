public class Customer{
	static int customerCount=2;
	final int fine=500;
	
	String name;
	String email;
	
	
	Customer(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	Customer(String name){
		this(name,"ABC@gmail.com";
	}
	
	public void display(){
		System.out.print("CustomerCount : "+customerCount);
		System.out.print("fine :"+fine);
		System.out.print("name: "+name);
		System.out.print("email"+email);
	}
	
	public void updateDetailes(String name)
	{
		this.name=name;
	}
	
	public void updateDetailes(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	
}
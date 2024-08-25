import Customer;
public class Solution{
	public static void main(String args[])
	{
		Customer c1=new Customer("Maddy","maddy@gmail.com");
		Customer c2=new Customer("Maddy2","maddy2@gmail");
		
		c1.display();
		c2.display();
		
		c1.updateDetails("Madhav");
		c1.updateDetails("MadhavLonkar","madhavlonkar2@gmail.com");
		
		
		
	}
}
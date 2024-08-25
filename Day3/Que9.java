//Write all Armstrong numbers between 100 to 500.
public class Que9 {
	
	public static void amstrongNumber(int a)
	{
		String str=""+a;
		int temp=a;
		int sum=0;
		while(a>0)
		{
			int rem=a%10;
			sum=(int) (sum+Math.pow(rem, str.length()));
			a=a/10;
		
		}
		if(temp==sum)
		{
			System.out.print("\n"+temp+" Is Amstrong Number");
		}
//		System.out.print("\nNo Amstrong Number Found");
	}
	
	public static void main(String[] args) {
		
		for(int i=100;i<=500;i++)
		{
			amstrongNumber(i);
		}
		
	}
}

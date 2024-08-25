public class swap05{
	
	public static void swapUsingThirdVariable(int a,int b)
	{
		//Swapping using third variable
		int temp=a;
		a=b;
		b=temp;
		
		System.out.print("A:"+a+" B:"+b);
	}
	
	public static void swapWithoutThirdVariable(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.print("A:"+a+" B:"+b);
		
	}
	
	public static void main(String args[])
	{
		int a=6;
		int b=8;
		
		System.out.println("A:"+a+" B:"+b);
		
		swapUsingThirdVariable(a,b);
		System.out.print("\n");
		swapWithoutThirdVariable(a,b);
		
		
	}
}
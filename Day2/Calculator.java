import java.util.*;
public class Calculator{

	public static void add(int ...arr){
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.print(sum);
	}
	
	public static void sub(int ...arr){
		int num=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			num-=arr[i];
		}
		System.out.print(num);
	}
	
	public static void divide(int ...arr){
		int num=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			num/=arr[i];
		}
		System.out.print(num);
	}
	
	public static void mul(int ...arr){
		int num=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			num*=arr[i];
		}
		System.out.print(num);
	}
	
	
	
	public static void main(String args[]){
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter Number Count:");
		int n=sn.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sn.nextInt();
		}
		
		
		
		System.out.print("Enter Symbol You Want Operation to be Performed: +,-,*,/: ");
		char c=sn.next().charAt(0);
		
		if(c=='+')
		{
			add(arr);
		}
		else if(c=='-')
		{
			sub(arr);
		}
		else if(c=='/')
		{
			divide(arr);
		}
		else if(c=='*')
		{
			mul(arr);
		}
	}
}
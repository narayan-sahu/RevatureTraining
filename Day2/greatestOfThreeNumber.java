import java.util.*;
public class greatestOfThreeNumber{
	public static void main(String agrs[]){
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter Number 1:");
		int a=sn.nextInt();
		System.out.print("Enter Number 2:");
		int b=sn.nextInt();
		System.out.print("Enter Number 3:");
		int c=sn.nextInt();
		
		if(a>b && a>c)
		{
			System.out.print(a+" is Greatest");
		}
		else if(b>a && b>c){
			System.out.print(b+" is Greatest");
		}
		else{
			System.out.print(c+" is Greatest");
		}
	}
}
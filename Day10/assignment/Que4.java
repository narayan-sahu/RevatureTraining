package tasks;

// Write a program to check if a given string is a Palindrome.
public class Que4 {
	public static void main(String[] args) {
		String str="BOB";
		int left=0;
		int right=str.length()-1;
		boolean flag=false;
		while(left<right)
		{
			flag=false;
			if(str.charAt(left)==str.charAt(right))
			{
				left++;
				right--;
				flag=true;
			}
			else
			{
				System.out.print("Its Not Palanrome");
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.print("Its Palanrome");
		}
	}
}

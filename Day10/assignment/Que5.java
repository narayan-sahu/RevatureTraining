package tasks;

//Input a string which contains some palindrome substrings.
//Find out the position of palindrome substrings if exist and replace it by *.
//(For example if input string is “bob has a radar plane” then it should 
//convert in “*** has a ***** plane”.
public class Que5 {
	public static void main(String[] args) {
		String str="bob has a radar plane";
		String[] arr=str.split(" ");
		 StringBuilder result = new StringBuilder();
		for(String s:arr)
		{
			StringBuilder sb=new StringBuilder(s);
			if(s.equals(sb.reverse().toString()))
			{
				result.append("*".repeat(s.length()));
			}
			else
			{
				result.append(s);
			}
			 result.append(" ");
		}
		
		System.out.print(result.toString());
		
	}
}

package tasks;
//3. Write a program to find the number of vowels, consonents, digits
//and white space characters in a string.

public class Que3 {
	public static void main(String[] args) {
		String str="Madhav Lonkar 123";
		str=str.toUpperCase();
		int digit=0;
		int vowels=0;
		int consonents=0;
		int whiteSpaces=0;
		
		for(char c:str.toCharArray())
		{
			if(Character.isDigit(c))
			{
				digit++;
			}
			else if(c==' ')
			{
				whiteSpaces++;
			}
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			{
				vowels++;
			}
			else
			{
				consonents++;
			}
		}
		
		System.out.print("Vowels:"+vowels+" Consonents :"+consonents+" White Space:"+whiteSpaces+" Digits:"+digit);
	}
}

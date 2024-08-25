package tasks;

//1. Write a program to check if the letter 'e' is present in the word 'Umbrella'.

public class Que1 {
public static void main(String[] args) {
	String str="Umbrella";
	char c='e';
	int index=str.indexOf(c);
	if(index>-1)
	{
		System.out.print("Present at :"+(index+1));
	}
	else {
		System.out.print("Not Present");
	}
}
}

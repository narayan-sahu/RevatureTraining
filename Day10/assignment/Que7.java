package tasks;
//7. Write a program to replace a given substring
//in a sentence with another string. For example, in the sentence, ” 
//A batman with bat” if we replace 
//”bat” with ”snow”, the new sentence should be printed as
//”A snowman with snow”.
public class Que7 {
	public static void main(String[] args) {
		String str="A batman with bat";
		String str2="snow";
		
		str=str.replace("bat", str2);
		System.out.print(""+str);
	}
}

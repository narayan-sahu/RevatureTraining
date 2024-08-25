import java.util.*;
public class percentage04{
	public static void main(String args[])
	{
		Scanner sn=new Scanner(System.in);
		try{
		System.out.print("Enter Robert Marks in Math");
		int math=sn.nextInt();
		System.out.print("Enter Robert Marks in English");
		int chem=sn.nextInt();
		System.out.print("Enter Robert Marks in Science");
		int sci=sn.nextInt();
		
		int totalMarks=math+sci+chem;
		System.out.print("Total Marks of Robert are:"+totalMarks);
		System.out.print("Total Percentage of Robert are "+((totalMarks*100)/300));
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
}
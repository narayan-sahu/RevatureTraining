import java.util.Scanner;

/**
 * 3. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */
public class Que3 {
	final static int classesHeld=100;
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		double total=(100*n)/classesHeld;
		if(total>=75)
		{
			System.out.print("You Are Allowded For Exam");
		}
		else {
			System.out.print("Do You have Medical Certificate ? (Y/N)");
			char c=sn.next().charAt(0);
			if(c=='Y')
			{
				System.out.print("You Are Allowded For Exam");
			}
			else {
				System.out.print("You Are Not Allowded For Exam");
			}
		}
	}
}

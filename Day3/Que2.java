import java.util.Scanner;

/**
 * 2. A school has following rules for grading system:
 *  a. Below 25 - F 
 *  b. 25 to 45 - E
 *  c. 45 to 50 - D 
 *  d. 50 to 60 - C 
 *  e. 60 to 80 - B
 *   f. Above 80 - A Ask
 * user to enter marks and print the corresponding grade.
 */
public class Que2 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter Your Percentage :");
		double per = sn.nextDouble();

		if (per > 80) {
			System.out.print("Grade A");
		} else if (per >=60 && per <= 80) {
			System.out.print("Grade B");
		} else if (per >= 50 && per < 60) {
			System.out.print("Grade C");
		}
		else if (per>= 45 && per < 50) {
			System.out.print("Grade D");
		}else if (per >= 25 && per <= 30) {
			System.out.print("Grade E");
		}else {
			System.out.print("Grade F");
		}
	}

}

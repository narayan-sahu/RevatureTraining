package Questions;
import java.util.*;

public class Multiplication {
	public static void main(String [] args)
	{
		int m=0;
		try {
			m=Integer.parseInt(args[0]);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//clean your objects here
			System.out.println("Finally block");
		}
		int product=m*7;
		System.out.println(product);
	}
}

import java.util.*;
public class temperature06{
	public static void main(String args[]){
		Scanner sn=new Scanner(System.in);
		
		System.out.print("Enter Temperature in Farenheit:");
		double tempF=sn.nextDouble();
		
		double tempC=(tempF-32)*5/9;
		System.out.print("Temperature in Celsius is :"+tempC);
		
	}
}
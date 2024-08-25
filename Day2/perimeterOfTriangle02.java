import java.util.*;
public class perimeterOfTriangle02{
	public static void calculatePerimeter(double a,double b,double c){
		System.out.print("Perimter of Triangle is :"+(a+b+c));
	}
	
	public static void main(String args[])
	{
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter Value of a,b,c (Seperated by spaces) :");
		String str=sn.nextLine();
		
		String[] inputs=str.split(" ");
		calculatePerimeter(Double.parseDouble(inputs[0]),Double.parseDouble(inputs[1]),Double.parseDouble(inputs[2]));
		
	}
}
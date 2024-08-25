public class AreaAndPerimeter01{
	public static void calculateArea(double length,double width){
		System.out.print("Area of Rectangle is :"+length*width);
	}
	
	public static void calculatePerimeter(double length,double width)
	{
		System.out.print("Perimeter of Rectangle is :"+((2*length)+(2*width)));
	}
	
	public static void main(String args[])
	{
		calculateArea(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
		System.out.print("\n");
		calculatePerimeter(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
	}
}
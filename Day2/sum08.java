public class sum08{
	public static void main(String args[])
	{
		int num=12345;
		String str=""+num;
		
		char num1=str.charAt(0);
		char num2=str.charAt(str.length()-2);
		
		int ans=Character.getNumericValue(num1)+Character.getNumericValue(num2);
		System.out.print(ans);
	}
}
/**
 * b.
1010101
 10101 
  101  
   1 
 */
public class Que6 {
	public static void main(String[] args) {
		
		int rows=5;
		for(int i=5;i>=1;i--)
		{
			for(int k=i;k<rows;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("1");
				if(j<i)
				{
					System.out.print("0");
				}
			}
			System.out.print("\n");
		}
	}
}

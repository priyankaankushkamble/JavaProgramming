public class CharPrintApp
{
	public static void main(String x[])
	{
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			int a=64;
			for(j=1;j<=5;j++)
			{
				if(i>=j)
			{
			System.out.printf("%c",a+j);
			}
			else
			{
			System.out.printf(" ");
			}
				
			}
			System.out.printf("\n");
		}
	}
}
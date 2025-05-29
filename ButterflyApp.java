public class ButterflyApp
{
	public static void main(String x[])
	{
		int i,j;
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(((j<=i || j>=11-i)&& i<=5)||((j<=11-i || j>=i)&& i>=6))
				{
					System.out.printf("*");
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
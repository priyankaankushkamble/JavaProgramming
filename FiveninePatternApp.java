public class FiveninePatternApp
{
		public static void main(String x[])
		{
			int i,j;
			for(i=1;i<=5;i++)
			{
			
				for(j=1;j<=9;j++)
			{
				if((j<=6-i || j>=4+i))
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

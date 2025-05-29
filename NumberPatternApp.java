public class NumberPatternApp
{
	public static void main(String x[])
	{
		int i,j,k=0;
		for(i=1;i<=4;i++)
		{
			boolean flag=true;
			for(j=1;j<=7;j++)
			{
			if((j>=5-i && j<=3+i)&& flag)
			{
				System.out.printf("%d",++k);
				flag=false;
			}
			else
			{
				System.out.printf(" ");
				flag=true;
			}
		}
		System.out.printf("\n");
	}
	}
}
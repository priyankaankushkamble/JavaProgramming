import java.util.*;
public class PrimeNumberApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int i,no,rem;
		boolean flag=true;
		System.out.println("Enter the number");
		no=xyz.nextInt();
		i=2;
		while(i<no)
		{
			rem=no%i;
			if(rem==0)
			{
				flag=false;
				break;
			}
			i++;
		}
		if(flag)
		{
			System.out.println("Number Is Prime");
		}
		else
		{
			System.out.println("Number is Not prime");
		}
	}
}
import java.util.*;
public class PerfectNumber
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int no,rem,sum=0;
		System.out.println("Enter The Number");
		no=xyz.nextInt();
		int i=1;
		while(i<no)
		{
			rem=no%i;
			if(rem==0)
		{
		sum=sum+i;
		}
		i++;
		}
		if(sum==no)
		{
			System.out.println("Number is Perfect");
		}
		else
		{
			System.out.println("Number is not perfect");
		}
	}
}
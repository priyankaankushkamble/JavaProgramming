import java.util.*;
public class DuckApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int no,rem;
		boolean flag=false;
		System.out.println("Enetr the number");
		no=xyz.nextInt();
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			if(rem==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Numbe is duck");
		}
		else
		{
			System.out.println("Number is not duck");
		}
	}
}
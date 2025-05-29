import java.util.*;
public class SearchApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		boolean flag=false;
		int no,rem,sdigit;
		System.out.println("Enter the number");
		no=xyz.nextInt();
		System.out.println("Enetr the number for search");
		sdigit=xyz.nextInt();
		while(no!=0)
		{
			rem=no%10;
			no=no/10;

		if(rem==sdigit)
		{
			flag=true;
			break;
		}
		}
		if(flag)
		{
			System.out.println("digit is present");
		}
		else
		{
			System.out.println("Not present");
		}
	}
}
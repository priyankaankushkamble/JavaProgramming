import java.util.*;
public class TableForApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter The Number");
		int no=xyz.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d\n",no*i);
			
		}
	}
}
import java.util.*;
public class PrintTableApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=xyz.nextInt();
		showTable(no);
	}
	public static void showTable(int x)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d\n",i*x);
		}
	}
}
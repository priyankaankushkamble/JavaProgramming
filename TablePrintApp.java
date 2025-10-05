import java.util.*;
public class TablePrintApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int no;
		System.out.println("Enter The Number");
		no=xyz.nextInt();

		int i=1;
		while(i<=10)
		{
		System.out.printf("%d\n",no*i);
			i++;
		}	
	}
}
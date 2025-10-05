import java.util.*;
public class TablePrintForApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int no;
		System.out.println("Enter The Number For Print Table");
		no=xyz.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d\n",no*i);
		}
	}
}
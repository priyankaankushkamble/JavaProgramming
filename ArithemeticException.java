import java.util.*;
public class ArithemeticException
{
	public static void main(String x[])
	{
	try
	{
	Scanner xyz=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter The Number");
	a=xyz.nextInt();
	b=xyz.nextInt();
	c=a/b;
	System.out.printf("Division is:%d\n",c);
	}
		catch(ArithmeticException ex)
		{
		System.out.println(ex);
		}	
	}
}
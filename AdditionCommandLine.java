import java.util.*;
public class AdditionCommandLine
{
	public static void main(String x[])
	{
		int a,b,c;
		a=Integer.parseInt(x[0]);
		b=Integer.parseInt(x[1]);
		c=a+b;

		System.out.printf("Addition is:%d\n",c);
	}
}
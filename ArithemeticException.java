import java.util.*;
public class ArithemeticException
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a,b,c;
		try{
			System.out.println("Enter Two Values");
			a=xyz.nextInt();
			b=xyz.nextInt();
			c=a/b;
			System.out.printf("Division is %d\n",c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Error is"+ex);
		}
			System.out.println("Logic 1:");
			System.out.println("Logic:2");
			System.out.println("Logic:3");
			System.out.println("Logic:3");
	}
}
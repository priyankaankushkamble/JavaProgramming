import java.util.*;
class Factorial
{
	int no;
	Scanner xyz=new Scanner(System.in);
	void setValue()
	{
		System.out.println("Enter The Value");
	no=xyz.nextInt();
	}
	int getFactorial()
	{
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class FactorialApp
{
	public static void main(String x[])
	{
		Factorial fact=new Factorial();
		fact.setValue();
		int result=fact.getFactorial();
		System.out.println("Factorial is:"+result);
	}
}
import java.util.*;
public class SwapCommandLine
{
	public static void main(String x[])
	{
		
		int a,b;
		a=Integer.parseInt(x[0]);
		b=Integer.parseInt(x[1]);

		System.out.printf("Before Swapping a=%d b=%d\n",a,b);

		int temp=a;
		a=b;
		b=temp;
	
		System.out.printf("After Swapping a=%d b=%d\n",a,b);
	}
}
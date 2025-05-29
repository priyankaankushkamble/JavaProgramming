import java.util.*;
public class MaxArrayApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		int max=a[0];
		for(int i=0;i<size;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
			System.out.print("Maximum Number is:"+max);
	}
}
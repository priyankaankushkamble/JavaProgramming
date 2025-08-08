import java.util.*;
public class ArrayDemoApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter Element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Display Element in Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
	}
}
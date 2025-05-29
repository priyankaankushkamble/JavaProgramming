import java.util.*;
public class ArrayDemoApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("\nDisplay Array");
		for(int i=0;i<size;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}
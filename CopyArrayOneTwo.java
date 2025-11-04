import java.util.*;
public class CopyArrayOneTwo
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter The Array Size");	
		int size=xyz.nextInt();
		int a[]=new int[size];
		int b[]=new int[a.length];
		System.out.println("Enter The Array Element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Copy Array");
		for(int i=0;i<size;i++)
		{
		System.out.println(b[i]+" ");
		}
	}
}
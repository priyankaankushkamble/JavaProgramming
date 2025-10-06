import java.util.*;
public class CopyArrayApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter The Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Copy Array Data:");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}
}
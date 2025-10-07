import java.util.*;
public class MergeArray
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[4];
		int c[]=new int[a.length+b.length];
		
		System.out.println("Enter The Value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter The Value");
		for(int i=0;i<b.length;i++)
		{
			b[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		System.out.println("Merge Array:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
		
		
	}
}
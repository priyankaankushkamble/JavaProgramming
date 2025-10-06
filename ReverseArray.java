import java.util.*;
public class ReverseArray
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter The Array Element");
	for(int i=0;i<a.length;i++)
	{
		a[i]=xyz.nextInt();
	}
		System.out.println("Display Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}	
		System.out.println("\n");
		System.out.println("Reverse Array:");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
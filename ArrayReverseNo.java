import java.util.*;
public class ArrayReverseNo
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter The Array Size");
	
	int size=xyz.nextInt();
	int a[]=new int[size];
	System.out.println("Enter The Array Element");
	for(int i=0;i<size;i++)
	{
	 a[i]=xyz.nextInt();
	}
		System.out.println("Display The Array Element");
		for(int i=0;i<size;i++)		
		{
		System.out.println(a[i]+" ");
		}
	System.out.println("Reverse Array is:");
	for(int i=size-1;i>=0;i--)
	{
		System.out.println(" "+a[i]);
	}
	}
}
import java.util.*;
public class ArrayReverseApp
{
	public static void main(String x[])	
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter The Size of Array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++)
		{
		a[i]=xyz.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println("\n");
		System.out.println("Reverse Array is:");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(" "+a[i]);
		}
		
	}
}
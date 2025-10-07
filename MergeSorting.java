import java.util.*;
public class MergeSorting
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
		System.out.println("Display Array");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]+" ");
		}
		for(int i=0;i<size;i++)
		{
		for(int j=i+1;j<size;j++)
		{
		if(a[i]>a[j]){

			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	
		}
		System.out.println("Sorted Array:");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
import java.util.*;
public class SortAscendingOrder
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Ente Size of Array");
	int size=xyz.nextInt();
	int a[]=new int[size];
	System.out.println("Enter The Array Element");
	for(int i=0;i<size;i++)
	{
		a[i]=xyz.nextInt();
	}
		System.out.println("Display Array Values");
		for(int i=0;i<size;i++)
		{
		System.out.print(" "+a[i]);
		}
		System.out.println("\n");
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
		System.out.println("Array in Ascending order:");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
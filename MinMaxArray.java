import java.util.*;
public class MinMaxArray
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
	int max=a[0];
	for(int i=0;i<size;i++)
	{
	if(a[i]>max)
	{
		max=a[i];
	}
	}
	int min=a[0];
	for(int i=0;i<size;i++)
	{
		if(a[i]<min)
	{
		min=a[i];
	}
	}
	System.out.println("Maximum Number is:"+max);
	System.out.println("Minimum Number is:"+min);
	}
	
}
import java.util.*;
public class MinArrayApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
			int min=a[0];
			for(int i=0;i<size;i++)
			{
				if(min>a[i])
				{
				min=a[i];
				System.out.println("Minimum Number is:"+min);	
				}
			
			}
	}
}
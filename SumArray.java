import java.util.*;
public class SumArray
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		int sum=0;
		System.out.println("Enter the Array Element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
			System.out.println("\n Display Array Element");
			for(int i=0;i<size;i++)
			{
			System.out.printf("%d\n",a[i]);
			sum=sum+a[i];
			}
				System.out.printf("\n Sum of all value is %d\n",sum);
		}
	
}
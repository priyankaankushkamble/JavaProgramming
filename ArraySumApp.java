import java.util.*;
public class ArraySumApp
{
	public static void main(String x[])
	{
			int sum=0;
			Scanner xyz=new Scanner(System.in);
			int a[]=new int[5];
			System.out.println("Enter Array Element");
			for(int i=0;i<a.length;i++)
			{
				a[i]=xyz.nextInt();
			}
			System.out.println("\nDisplay Array Element");
			for(int i=0;i<a.length;i++)
			{
				System.out.printf("%d\t",+a[i]);
				sum=sum+a[i];
			}
			System.out.printf("\nSum of number is:%d\n",sum);
	}
}
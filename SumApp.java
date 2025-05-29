import java.util.*;
public class SumApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int no,sum=0;
		System.out.println("Enter the number for sum");
		no=xyz.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			sum=sum+i;
		
		}
		System.out.printf("Sum is:%d\n",sum);
	}
}
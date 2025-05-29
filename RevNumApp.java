import java.util.*;
public class RevNumApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=xyz.nextInt();
		int result=getRev(no);
		System.out.printf("Reverse Number is %d\n",result);
	}
	public static int getRev(int x)
	{
		int r=0,rem;
		while(x!=0)
		{
			rem=x%10;
			x=x/10;
         r=r*10+rem;
		}
			return r;
	}
}
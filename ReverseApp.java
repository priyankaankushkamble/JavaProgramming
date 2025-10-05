import java.util.*;
public class ReverseApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int no,rem,rev=0;
		System.out.println("Enter The Number");
		no=xyz.nextInt();
		while(no>0)
		{
		rem=no%10;
		no=no/10;
		rev=rev*10+rem;
		}
		System.out.println("Reverse Number is:"+rev);
	}
}
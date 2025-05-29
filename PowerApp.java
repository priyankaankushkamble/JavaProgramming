import java.util.*;
public class PowerApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int base,index;
		System.out.println("Enter Base");
		base=xyz.nextInt();
		System.out.printf("Enter Index");
		index=xyz.nextInt();
		showPower(base,index);
	}
	public static void showPower(int base,int index)
	{
		int p=1;
		for(int i=1;i<=index;i++)
		{
			p=p*base;
		}
		System.out.printf("\nPower is %d\n",p);
	}
}
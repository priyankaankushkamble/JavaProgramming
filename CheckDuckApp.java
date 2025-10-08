import java.util.*;
class Duck
{
	int no;
	Duck(int no)
	{
		this.no=no;
	}
	void checkDuck()
	{
		int temp=no;
		boolean flag=false;
	while(temp>0)
	{
		int digit=temp%10;
		if(digit==0)
		{
		flag=true;
		break;
	}
		temp=temp/10;
	}
		if(flag)
		{
			System.out.println("Number is Duck");
		}
		else
		{
			System.out.println("Number is Not Duck");
		}
	}
}
public class CheckDuckApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter The Number");
		int no = xyz.nextInt();
		Duck d = new Duck(no);
                d.checkDuck();
		
	}
}
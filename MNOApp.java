abstract class ABC
{
}
class MNO extends ABC implements Runnable
{
	public void run()
	{
	try{
	for(int i=1;i<=5;i++)
	{
		System.out.printf("I = %d\n",i);
		Thread.sleep(10000);
	}
	}
	catch(Exception ex)
	{
		System.out.println("Error is "+ex);
	}
	}
}
public class MNOApp
{
	public static void main(String x[])
	{
		Runnable r= new MNO();
		Thread t1=new Thread(r);
		t1.start();
	}
}

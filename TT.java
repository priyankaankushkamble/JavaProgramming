public class TT
{
	public static void main(String x[])
	{
	Runnable r=new Runnable(){
	public void run()
	{
	
		try{
		
			for(int i=1;i<=5;i++)
		{
		System.out.printf("I =%d\n",i);
			Thread.sleep(1000);
		}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
		}
	} ;
	Thread t=new Thread(r);
	t.start();

	}
}
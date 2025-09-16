public class RunnableThreadApp
{
	public static void main(String x[])
	{
	Thread t=new Thread()
	{
		public void run()
	{
		try{
		for(int i=1;i<=5;i++)
		{
			System.out.printf("I = %d\n",i);
			Thread.sleep(1000);	
		}
		}
	catch(Exception ex)	
	{
		System.out.println("Error is "+ex);
	}
	}
	};
	t.start();
	}
}
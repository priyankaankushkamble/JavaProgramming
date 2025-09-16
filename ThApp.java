public class ThApp
{
	public static void main(String x[])
	{
		Thread t=Thread.currentThread();
		String threadName=t.getName();
		System.out.println(threadName);
		System.out.println("Priority of main Thraed "+t.getPriority());
	}
}
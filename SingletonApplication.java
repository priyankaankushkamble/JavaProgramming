class Singleton
{
	public static Singleton s1=null;
	private Singleton()
	{
		System.out.println("I am Singleton class");
	}
	public static Singleton getInstance()
	{
	if(s1==null)
	{
		s1=new Singleton();
	}
		return s1;
	}
}
public class SingletonApplication
{
	public static void main(String x[])
	{
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
	}
}
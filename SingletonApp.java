class S
{
	public static S s1=null;
	private S()
	{
		System.out.println("I am Singleton Class");
	}
	public static S getInstance()
	{
		if(s1==null)
		{
			s1=new S();
		}
		return s1;
	}
}
public class SingletonApp
{
	public static void main(String x[])
	{
		S s1=S.getInstance();
		S s2=S.getInstance();
		S s3=S.getInstance();

	}
}
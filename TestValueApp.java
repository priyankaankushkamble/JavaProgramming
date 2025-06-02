public class TestValueApp
{
	public static void main(String x[])
	{
		int a=12345;
		Integer b=Integer.valueOf(a);
		System.out.printf("B is %d\n",b);
		String s=String.valueOf(a);
		System.out.println("String is "+s);
	
		Float f=Float.valueOf(a);
		System.out.println("Float is "+f);
	}
}
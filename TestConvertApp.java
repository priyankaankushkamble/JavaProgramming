public class TestConvertApp
{
	public static void main(String x[])
	{
		int a=100;
		long b=a;//implicit conversion
		System.out.printf("A=%d\tB=%d\n",a,b);
		
		long d=200;
		int e=(int)d;//explicit conversion
		System.out.printf("D=%d\tE=%d\n",d,e);
	}
}
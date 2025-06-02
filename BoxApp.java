public class BoxApp
{
	public static void main(String x[])
	{
		Double d=5.4;
		int b=d.intValue();
		System.out.printf("D=%f\tB=%d\n",d,b);
		float f=d.floatValue();
		System.out.printf("D=%f\tF=%f\n",d,f);
		long l=d.longValue();
		System.out.printf("D=%f\tL=%d\n",d,l);
	}
}
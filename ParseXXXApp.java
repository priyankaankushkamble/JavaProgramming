public class ParseXXXApp
{
	public static void main(String x[])
	{
		String s="12345";
		int b=Integer.parseInt(s);
		float c=Float.parseFloat(s);
		double d=Double.parseDouble(s);

		System.out.printf("B is %d\n",b);
		System.out.printf("C is %f\n",c);
		System.out.printf("D is %f\n",d);
	}
}
import java.util.*;
public class ArrayIndexOutOfBounds
{
	public static void main(String x[])
	{
	try
	{
	int a[]=new int[]{10,20,30,40};
	{
		System.out.println(a[4]);
	}
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println("Error is:"+ex);
	}
	}
}
import java.util.*;
public class NotFoundException
{
	public static void main(String x[])
	{
	try
	{
		Class.forName("sddusxzbc");
	}
	catch(ClassNotFoundException ex)
	{
		System.out.println("Error is:"+ex);
	}
	catch(NoClassDefFoundError ex)
	{
		System.out.println("Error is:"+ex);
	}
	}
}
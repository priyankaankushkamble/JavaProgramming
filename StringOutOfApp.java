import java.util.*;
public class StringOutOfApp
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	try
	{
		System.out.println("Enter String");
		char ch=xyz.nextLine().charAt(0);
		System.out.println("First Char:"+ch);
		
	}	
	catch(StringIndexOutOfBoundsException ex)
	{
		System.out.println("Error is:"+ex);
	}
	}
}
import java.util.*;
public class ReverseStringApp
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter The String");
	String s=xyz.nextLine();

	String reverse="";

	for(int i=s.length()-1;i>=0;i--)
	{
		reverse=reverse+s.charAt(i);
	}
	System.out.println("Reverse String is:"+reverse);
	
	}
}
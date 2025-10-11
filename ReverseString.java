import java.util.*;
public class ReverseString
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter The String");
	String str=xyz.nextLine();
	
	String reverse="";
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
	}
	System.out.println("Reverse String is:"+reverse);
	}
}
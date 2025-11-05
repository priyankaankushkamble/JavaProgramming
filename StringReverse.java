import java.util.*;
public class StringReverse
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter The String Element");
	String s=xyz.nextLine();
	
	String Reverse="";

	for(int i=s.length()-1;i>=0;i--)
	{

		Reverse=Reverse+s.charAt(i);
	}
	System.out.println("Reverse String is:"+Reverse);
	}
}
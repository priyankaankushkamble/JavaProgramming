import java.util.*;
public class UppercaseConvert
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter The String");
	String str=xyz.nextLine();

		String result="";
	
	for(int i=0;i<str.length();i++)
	{
	char ch=str.charAt(i);

	if(ch>='a' && ch<='z')
	{
		ch=(char)(ch-32);
	}
		result=result+ch;
	}
	System.out.println("Uppercase String is:"+result);
}
}
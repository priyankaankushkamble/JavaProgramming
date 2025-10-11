import java.util.*;
public class ComapareString
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=xyz.nextLine();
	
		System.out.println("Enter Second String");
		String str2=xyz.nextLine();

		Boolean isEqual=true;

		if(str1.length()!=str2.length())
		{
			isEqual=false;
		}
		else
		{
			for(int i=0;i<str1.length();i++)
			{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				isEqual=false;
				break;
			}
			}
		}
		if(isEqual)
		{
			System.out.println("String is equal");
		}
		else
		{
			System.out.println("String is not equal");
		}
		
	}
}
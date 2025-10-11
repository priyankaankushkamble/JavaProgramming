import java.util.*;
public class DigitSumApp
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter String");
	String str=xyz.nextLine();
	int sum=0;
	System.out.println("Digit:");
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);

	if(Character.isDigit(ch))
	{
		int digit=ch-'0';
		sum+=digit;
		System.out.println(digit +" ");
	}
	}
	
	System.out.println("\nSum is:"+sum);
	xyz.close();
}
}
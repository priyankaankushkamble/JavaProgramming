import java.util.*;
public class Symdigcha
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	char ch;
	System.out.println("Enter The  Element");
	ch=xyz.nextLine().charAt(0);
	if(ch>='0' && ch<='9')
	{
		System.out.println("Digit");
	}
	else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
	{
		System.out.println("Character");
	}
	else
	{
		System.out.println("Symbol");
	}
	}
}
import java.util.*;
public class AlbhabetDigitSymbolApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter The Data From Keyboard");
		char ch=xyz.nextLine().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println("Digit");
		}
		else if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Special Symbol");
		}
	}
}
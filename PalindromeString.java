
import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {

		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter The String");//input string
		String str=xyz.nextLine();
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))//condition
				{
			System.out.println("Palindrome");
				}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}

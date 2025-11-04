import java.util.*;
public class MergeString
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter The First String");
	String s=xyz.nextLine();
	System.out.println("Enter The Second String");
	String s1=xyz.nextLine();
	
		String merged=s+s1;

	System.out.println("Merge String is:"+merged);
	}
}
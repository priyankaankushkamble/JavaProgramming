import java.util.*;
public class SortedString
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter The String");
	String s=xyz.nextLine();
	
	char[]arr=s.toCharArray();
	Arrays.sort(arr);

	String sorted=new String(arr);
	
	System.out.println("Sorted String is:"+sorted);
	
	
	}
}
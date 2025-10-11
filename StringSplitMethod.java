public class StringSplitMethod
{
	public static void main(String x[])
	{
	String s="priya@gmail.com.Riya@gmail.com,Siya@gmail.com,Diya@gmail.com";
	
	String words[]=s.split(",");
	for(String word:words)
	{
		System.out.println(word);
	}

		}
}
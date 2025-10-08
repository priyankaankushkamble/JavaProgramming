class Utility
{
	private Utility()
	{
	}
	static void Show()
	{
		System.out.println("I am Show method of Utility");
	}
	static void Display()
	{
		System.out.println("I am Display method of Utility");
	}
}
public class UtilityApplication
{
	public static void main(String x[])
	{
		Utility.Show();
		Utility.Display();
	}
}
class U
{
	private U()
	{
	}
	static void Show()
	{
		System.out.println("I am Show Method of U");
	}
	static void display()
	{
		System.out.println("I am Display method of U");
	}
}
public class UtilityApp
{
	public static void main(String x[])
	{
		U.Show();
		U.display();

	}
}
abstract class A
{
	abstract void show();
	void display()
	{
	System.out.println("I am Display Method");
	}
}
class B extends A
{
	void show()
	{
	System.out.println("I am Show Method");
	}
}
public class AbstractApp
{
	public static void main(String x[])
	{
	B b1=new B();
	b1.display();
	b1.show();
	}
}
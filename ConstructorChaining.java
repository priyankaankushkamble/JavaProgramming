class C
{
	C()
	{
		this(5);//Integer Constructor
		System.out.println("I am Default Constructor");
	}
	C(int x)
	{
		this(5.5f);//Float Value
		System.out.println("I am Integer Constructor:"+x);
	}
	C(float x)
	{
		System.out.println("I am Float Constructor:"+x);
	}

}
public class ConstructorChaining
{
	public static void main(String x[])
	{
		C c1=new C();
	}
}
import java.util.*;
class Cubee
{
	int no;
	Scanner xyz=new Scanner(System.in);
	void setValue()
	{
		System.out.println("Enter The Value");
		no=xyz.nextInt();
	}
	void getCube()
	{
	System.out.printf("Cube is:%d\n",no*no*no);
	}
}
public class CubeApplication
{
	public static void main(String x[])
	{
	Cubee c=new Cubee();
	c.setValue();
	c.getCube();
	}
}
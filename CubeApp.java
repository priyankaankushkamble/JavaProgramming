import java.util.*;
class Cube
{
	int no;
	Scanner xyz=new Scanner(System.in);
	void setvalue()
	{
		System.out.println("Enter the value");
		no=xyz.nextInt();
	}
		void showcube()
		{
			System.out.printf("Cube is %d\n",no*no*no);
		}
}
public class CubeApp
{
	public static void main(String x[])
	{
		Cube c=new Cube();
		c.setvalue();
		c.showcube();
	}
}
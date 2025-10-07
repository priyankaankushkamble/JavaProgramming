import java.util.*;
class Cube
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
public class CubeApp
{
	public static void main(String x[])
	{
		Cube c=new Cube();	

		c.setValue();
		c.getCube();		
	}
}




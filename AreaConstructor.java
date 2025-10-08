class Area
{
	Area(float radius)
	{
	float area=radius*radius*3.14f;	
	
		System.out.printf("Area of Circle is:%f\n",area);
	}
	Area(int len,int width)
	{
		System.out.printf("Area of Rectangle is:%d\n",len*width);
	}
}
public class AreaConstructor
{
	public static void main(String x[])
	{
		Area a1=new Area(3.3f);
		Area a2=new Area(5,5);
	}
}
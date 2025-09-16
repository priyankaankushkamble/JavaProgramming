import java.util.*;
class Product
{
	private int id;
	private String name;
	private String spareOne;
	private String spareTwo;

	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSpareOne(String spare)
	{
		this.spareOne=spare;
	}
	public String getSpare()
	{
		return spareOne;
	}
	public void setSpareTwo(String spareTwo)
	{
		this.spareTwo=spareTwo;
	}
	public String getSpareTwo()
	{
		return spareTwo;
	}
	
}
class Machine1 extends Thread
{
	Product p[];
	int count;
	void setProducts(Product p[])
	{
		this.p=p;
	}
	public void run()
	{
	try{
		for(int i=0;i<p.length;i++)
		{
		p[i].setSpareOne("Set By Machine 1");
		System.out.println("Product Use by Machine1");
		sleep(10000);
	}
	}
	catch(Exception ex)
	{
		System.out.println("Error is "+ex);
	}
	}
	
}
class Machine2 extends Thread
{
	Product p[];
	int count=0;
	void setProducts(Product p[])
	{
		this.p=p;
	}
	public void run()
	{
	try{
		for(int i=0;i<p.length;i++)
		{
		p[i].setSpareTwo("Set By Machine 2");
		System.out.println("Product Use by Machine2");
		sleep(10000);
		
	}
	}
	catch(Exception ex)
	{
		System.out.println("Error is "+ex);
	}
	}
	

}
public class ProductMachineApp
{
	public static void main(String x[]) throws Exception
	{
		Product prod[]=new Product[5];
		for(int i=0;i<prod.length;i++)
		{
			System.out.println("Enter Product name and id");
			Scanner xyz=new Scanner(System.in);
		String name=xyz.nextLine();
		int id=xyz.nextInt();
		prod[i]=new Product();
		prod[i].setId(id);
		prod[i].setName(name);
		
		}
	Machine1 m1= new Machine1();
	m1.setProducts(prod);
	m1.start();
	Machine2 m2=new Machine2();
	m2.setProducts(prod);	
	m2.start();
	}
	
}
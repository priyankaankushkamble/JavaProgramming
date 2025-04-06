class Product
{
	private int id;
	private String name;
	private int price;

	public void setid(int id)
	{
		this.id=id;
	}
		public int getid()
		{
			return id;
		}
	public void setname(String name)
	{
		this.name=name;
	}
		public String getname()
		{
			return name;
		}
	public void setprice(int price)
	{
		this.price=price;
	}
		public int getprice()
		{
			return price;
		}
}
public class ProductApp
{
	public static void main(String x[])
	{
	Product pro=new Product();
	pro.setid(1);
	pro.setname("ABC");
	pro.setprice(25000);

		System.out.println("Id is:"+pro.getid());
		System.out.println("Name is:"+pro.getname());
		System.out.println("Price is:"+pro.getprice());
	}
}
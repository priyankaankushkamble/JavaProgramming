class Product
{
	private String prodName;
	private String prodDealName;
	private String prodCompName;
	private int purPrice;
	private int salePrice;

	
		public void setprodName(String prodName)
		{
			this.prodName=prodName;
		}
		public String getprodName()
		{
			return prodName;
		}
		public void setprodDealName(String prodDealName)
		{
			this.prodDealName=prodDealName;
		}
		public String getprodDealName()
		{
			return prodDealName;
		}
		public void setprodCompName(String prodCompName)
		{
			this.prodCompName=prodCompName;
		}
		public String getprodCompName()
		{
			return prodCompName;
		}
		public void setpurPrice(int purPrice)
		{
			this.purPrice=purPrice;
		}
		public int getpurPrice()
		{
			return purPrice;
		}
		public void setsalePrice(int salePrice)
		{
			this.salePrice=salePrice;
		}
		public int getsalePrice()
		{
			return salePrice;
		}
	
}
class AccessProduct
{
		private Product product;
		public void setDetails(Product product)
		{
			this.product=product;
		}
	public void verifyUser(String loginType)
	{
		if(loginType.equals("admin"))
		{
		System.out.println("Admin Access:");	System.out.println(product.getprodName()+"\t"+product.getprodDealName()+"\t"+product.getprodCompName()+"\t"+product.getsalePrice()+"\t"+product.getsalePrice());
		}
		else if(loginType.equals("employee"))
		{
		System.out.println("Employee Access:");				System.out.println(product.getprodName()+"\t"+product.getprodCompName()+"\t"+product.getpurPrice()+"\t"+product.getsalePrice());		}
		else
		{
			System.out.println("Invalid User");
		}
	}
	
}
public class EncApplication
{
	public static void main(String x[])
	{
		AccessProduct acp=new AccessProduct();
		Product p=new Product();
		p.setprodName("MoongDal");
		p.setprodDealName("MoonDal Deal");
		p.setprodCompName("Balajii");
		p.setpurPrice(15);
		p.setsalePrice(10);

		acp.setDetails(p);
		acp.verifyUser("admin");
	}
}
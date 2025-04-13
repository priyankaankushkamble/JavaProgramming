class Product
{
	private String prodName,prodDealName,prodCompName;
	private int purPrice,salePrice;
	
	public void setProdName(String prodName)
	{  
		this.prodName=prodName;
	}
	public String getProdName()
	{
		return prodName;
	} 
	public void setProdDealName(String prodDealName)
	{ 
		this.prodDealName=prodDealName;
	}
	public String getProdDealName()
	{
		  return prodDealName;
	}
	public void setProdCompName(String prodCompName)
	{  
		this.prodCompName=prodCompName;
	}
	public String getProdCompName()
	{
		 return prodCompName;
	} 
	public void setPurPrice(int price)
	{ 
		this.purPrice=price;
	}
	public int getPurPrice()
	{
		  return purPrice;
	}
	public void setSalePrice(int salePrice)
	{ 
		this.salePrice=salePrice;
	}
	public int getSalePrice()
	{
		 return salePrice;
	} 
}
class AccessProduct
{
  
	Product product;
	public void setDetails(Product product)
	{
		this.product=product;
	}
	public void verifyUser(String loginType)
	{
	    if(loginType.equals("admin"))
		{
		  System.out.println(product.getProdName()+"\t"+product.getProdDealName()+"\t"+product.getProdCompName()+
		  "\t"+product.getPurPrice()+"\t"+product.getSalePrice());
		}
		else if(loginType.equals("employee"))
		{
		System.out.println(product.getProdName()+"\t"+product.getProdCompName()+"\t"+product.getSalePrice());
		}
		else
		{ 
			System.out.println("Invalid user");
		}
	}
}
public class EncApplication
{
   public static void main(String x[])
   {
        AccessProduct acp= new AccessProduct();
	   Product p1 = new Product();
	   p1.setProdName("ABC");
	   p1.setProdDealName("ABC Dealer");
	   p1.setProdCompName("ABC Company");
	   p1.setPurPrice(100);
	   p1.setSalePrice(200);
	   
	   acp.setDetails(p1);
	   acp.verifyUser("admin");
   }
}



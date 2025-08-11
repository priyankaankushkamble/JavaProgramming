package org.techhub;

public class AccessProduct {

	Product product;
	public void setDetails(Product product)
	{
		this.product=product;
	}
	public void verifyUser(String loginType)
	{
		if(loginType.equals("admin"))
		{
			System.out.println(product.getProdName()+"\t"+product.getProdDealName()+"\t"+product.getProdCompName()+"\t"+product.getPurPrice()+"\t"+product.getSalePrice());
		}
		else if(loginType.equals("employee"))
		{
			System.out.println(product.getProdName()+"\t"+product.getProdCompName()+"\t"+product.getSalePrice());
		}
		else {
			System.out.println("Invalid User");
		}
	}

}

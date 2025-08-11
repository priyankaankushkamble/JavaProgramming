package org.techhub;

public class EncApp {

	public static void main(String[] args) {
		
		
		AccessProduct acp=new AccessProduct();
		Product p1=new Product();
		p1.setProdName("ABC");
		p1.setProdDealName("Deal ABC");
		p1.setProdCompName("PQR");
		p1.setPurPrice(100);
		p1.setSalePrice(3000);
		
		
		acp.setDetails(p1);
		acp.verifyUser("admin");
	}

}

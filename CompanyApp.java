package org.techhub;

public class CompanyApp {

	public static void main(String[] args) {
		Company c=new Company();
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("ABC");
		e.setSal(100000);
		e.setAddress("PUNE");
		e.setPrevComp("TCS");
		
		c.setEmployee(e);
		c.showDetails();
	}

}

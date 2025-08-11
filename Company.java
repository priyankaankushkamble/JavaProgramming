package org.techhub;

public class Company {
	private Employee emp;
	void setEmployee(Employee employee)
	{
		emp=employee;
	}
	void showDetails()
	{
		String name=emp.getName();
		int id=emp.getId();
		String address=emp.getAddress();
		int sal=emp.getSal();
		String prevComp=emp.getPrevComp();
		
		System.out.println("Name is:"+name);
		System.out.println("Id is:" +id);
		System.out.println("Address is:"+address);
		System.out.println("Salary is:"+sal);
		System.out.println("Previous Company:"+prevComp);
		
	}
}

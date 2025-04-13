class Employee
{
	private int id;
	private String name;
	private String address;
	private int salary;
	private long phone;


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
	public void setaddress(String address)
	{
		this.address=address;
	}
		public String getaddress()
		{
			return address;
		}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
		public int getsalary()
		{
			return salary;
		}
	public void setphone(long phone)
	{
		this.phone=phone;
	}
		public long getphone()
		{
			return phone;
		}
}
public class EmployeeApp
{
	public static void main(String x[])
	{
		Employee emp=new Employee();
		emp.setid(2);
		emp.setname("Priya");
		emp.setaddress("Pune");
		emp.setsalary(75000);
		emp.setphone(8767281195L);

		System.out.println("Id is:"+emp.getid());
		System.out.println("Name is:"+emp.getname());
		System.out.println("Address is:"+emp.getaddress());
		System.out.println("Salary is:"+emp.getsalary());
		System.out.println("Phone is:"+emp.getphone());
	}
}
class Employee
{
	private int id;
	private String name;
	private int sal;

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
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
}
public class EmployeeApp
{
	public static void main(String x[])
	{
		Employee emp=new Employee();
		
		emp.setId(18);
		emp.setName("Riya");
		emp.setSal(75000);

		System.out.println("Employee Data:");
		System.out.println("ID is:"+emp.getId());
		System.out.println("Name is:"+emp.getName());
		System.out.println("Salary is:"+emp.getSal());
	}
}
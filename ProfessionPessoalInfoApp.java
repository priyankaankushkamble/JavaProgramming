class PersonalInfo
{
	protected String name;
	protected String middlename;
	protected String lastname;

	public PersonalInfo(String name,String middlename,String lastname)
{
	this.name=name;
	this.middlename=middlename;
	this.lastname=lastname;
}
}
class ProfessionalInfo extends PersonalInfo
{
	private int id;
	private String des;
	private int salary;
	private String skillset;
	
	public ProfessionalInfo(int id,String des,int salary,String skillset,String name,String middlename,String lastname)
	{
		super(name,middlename,lastname);
		this.id=id;
		this.des=des;
		this.salary=salary;
		this.skillset=skillset;
	}
	public void show()
	{
		System.out.println("Name is:"+name+" "+middlename+" "+lastname);
		System.out.println("ID is:"+id);
		System.out.println("Designation is:"+des);
		System.out.println("Salary is:"+salary);
		System.out.println("SkillSet is:"+skillset);
	}
}
public class ProfessionPessoalInfoApp
{
	public static void main(String x[])
	{
		ProfessionalInfo pi=new ProfessionalInfo(101,"Software Developer",75000,"java,Node","Siya","Anjan","Gawali");

	pi.show();
		
	}
}

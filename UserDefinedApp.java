class AgeVerification extends RuntimeException
{
	private String message;
	AgeVerification(String message)
	{
		this.message=message;
	}
	public String getErrMessage()
	{
		return message;
	}
}
class Hiring
{
	void checkage(int age)
	{
	if(age<=15)
	{
	throw new AgeVerification("Your Age is Not Suitable:"+age);
	}
	else
	{
		System.out.println("On boarding process string");
	}
	}
}
public class UserDefinedApp
{
	public static void main(String x[])
	{
	try
	{
	Hiring h=new Hiring();
	h.checkage(10);
	}
	catch(AgeVerification ex)
	{
		System.out.println("Error is:"+ex.getErrMessage());
	}
	}
}
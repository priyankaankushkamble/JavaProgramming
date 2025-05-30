import java.io.*;
public class FileNotFoundException
{
	public static void main(String x[])
	{
		try{
			FileReader fr=new FileReader("D:\\MAY_STUDY_PLAN_OOP\\myfilehandling\\TableForApp.txt");
			int data;
			while((data=fr.read())!=-1)
			{
				char ch=(char)data;
				System.out.print(ch);
			}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Error is "+ex);
		}	
			catch(IOException ex)
			{
				System.out.println("Error is "+ex);
			}
	}
}
import java.util.*;
public class CheckAnagramArray
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter the First Value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter The Second Value");
		for(int i=0;i<b.length;i++)
		{
			b[i]=xyz.nextInt();
		}
		boolean result=checkAnagramArray(a,b);
		if(result)
		{
			System.out.println("Array is Anagram");
		}
		else
		{
			System.out.println("Array Is not Anagram");
		}
	}
		public static boolean checkAnagramArray(int m[],int n[])
		{
			boolean flag=true;
			for(int i=0;i<m.length;i++)
			{
				for(int j=(i+1);j<m.length;j++)
				{

				if(m[i]>m[j])
				{
					int temp=m[i];
					m[i]=m[j];
					m[j]=temp;
				}
				if(n[i]>n[j])
				{
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
		
				}
			}	
			for(int i=0;i<m.length;i++)
			{
				if(m[i]!=n[i])
				{
					flag=false;
					break;					
				}
				
			}
				return flag;
		}
}
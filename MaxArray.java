import java.util.*;
class Max
{
	int arr[];
	void setArray(int a[])
	{
		arr=a;
	}
  	int getMax()
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]>max)
		{
		max=arr[i];
		}
		}
		return max;
	}

}
public class MaxArray
{
	public static void main(String x[])
	{
		int marr[]=new int[5];
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Value");
		for(int i=0;i<marr.length;i++)
		{
			marr[i]=xyz.nextInt();
		}
			  Max m = new Max();
	  		  m.setArray(marr);
	 		 int result=m.getMax();
		         System.out.printf("Max value is %d\n",result);

		}
}
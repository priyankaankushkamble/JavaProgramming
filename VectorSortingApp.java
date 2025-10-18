import java.util.*;
public class VectorSortingApp
{
	public static void main(String x[])
	{
	Vector v=new Vector();
	v.add(899);
	v.add(90);
	v.add(400);
	v.add(200);
	v.add(453);
	
	System.out.println("Before Sorting Vector");
	Iterator itr=v.iterator();
	while(itr.hasNext())
	{
	Object obj=itr.next();
	System.out.print(obj +"\t");
	}
	int len=v.size();
	for(int i=0;i<len;i++)
	{
	for(int j=(i+1);j<len;j++)
	{
	Object prev=v.get(i);
	Object next=v.get(j);
	
	if((int) prev>(int)next){
		v.set(i,next);
		v.set(j,prev);
	}
	}
	}
	System.out.println("\n After Sorting");
	itr=v.iterator();
	while(itr.hasNext())
	{
	Object obj=itr.next();
	System.out.print(obj+"\t");
	}
	}
}
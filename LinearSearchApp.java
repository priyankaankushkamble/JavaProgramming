package org.techhub;
import java.util.*;
public class LinearSearchApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		boolean flag=false;
		System.out.println("Enter The Array Size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<size;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.println("\n");
		System.out.println("Enter Digit for Search");
		int sdigit=xyz.nextInt();
		for(int i=0;i<size;i++)
		{
			if(a[i]==sdigit)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Number is Found.....");
		}
		else
		{
			System.out.println("Number is Not Found");
		}
	}

}

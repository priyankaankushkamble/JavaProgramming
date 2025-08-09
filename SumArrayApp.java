package org.techhub;
import java.util.*;
public class SumArrayApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		int sum=0;
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<size;i++)
		{
			System.out.printf("%d\t",a[i]);
			sum=sum+a[i];
		}
		System.out.println("\nSum of Array Is:\n"+sum);
		System.out.printf("\n");
	}

}

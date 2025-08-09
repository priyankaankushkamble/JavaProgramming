package org.techhub;
import java.util.*;
public class MoveZeroArray {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Array Size");
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
		System.out.printf("\n");
			int left=0;
			for(int i=0;i<size;i++)
			{
				if(a[i]!=0)
				{
				int temp=a[i];
				a[i]=a[left];
				a[left]=temp;
				
				left++;
			}
			}
			System.out.println("Afetr Move Zero");
			for(int i=0;i<size;i++)
			{
				System.out.printf("%d\t",a[i]);
			}

	}

}

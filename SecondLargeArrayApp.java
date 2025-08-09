package org.techhub;
import java.util.*;
public class SecondLargeArrayApp {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
	
		System.out.println("Enter Array Size");
		int size = xyz.nextInt();
		int a[] = new int[size];
		System.out.println("Enter Array Element");
		for (int i = 0; i < size; i++) {
			a[i] = xyz.nextInt();
		}
		System.out.println("Display Array Element");
		for (int i = 0; i < size; i++) {
			System.out.printf("%d\t", a[i]);
		}
		System.out.printf("\n");
		
		int large=Integer.MIN_VALUE;
		int slarge=Integer.MIN_VALUE;
		
		for(int i=0;i<size;i++)
		{
			if(a[i]>large)
			{
				
				slarge=large;
				large=a[i];
			}
			else if(a[i]>slarge && a[i]!=large) 
			{
				slarge=a[i];
			}
			}
		if(slarge==Integer.MIN_VALUE) {
			System.out.println("There is no Second Large Number");
		}
		else
		{
			System.out.println("Second Large Number is:"+slarge);
		}
	}

}

package org.techhub;
import java.util.*;
public class QueueApp {

	static int queue[]=new int[5];
	static int front=0,rear=-1;
	public static void main(String[] args) {
		
do {
	Scanner xyz=new Scanner(System.in);
	System.out.println("1:INSERT");
	System.out.println("2:DELETE");
	System.out.println("3:DISPLAY");
	System.out.println("Enter Your Choice");
	int choice=xyz.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Enter data in queue");
		int data=xyz.nextInt();
		insert(data);
		break;
	case 2:
		delete();
		break;
	case 3:
		display();
		break;
		default:
		System.out.println("Wrong Choice");
		}
	}
		while(true);
	}
	public static void insert(int value)
	{
		int MAX=queue.length;
		if(rear==(MAX-1))
		{
			System.out.println("QUeue is Full");
		}
		else
		{
			rear=rear+1;
			queue[rear]=value;
		}
	}
	public static void delete()
	{
		if((rear==-1 && front==0)||(front==rear+1))
		{
			System.out.println("Queue is empty");
		}
		else {
			int value=queue[front];
			front=front+1;
			System.out.println("Deleted Data"+value);
		}
				}
	public static void display()
	{
		if((rear==-1 && front==0)||(front==rear+1))
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.printf("%d\t",queue[i]);
			}
		}
	}

}

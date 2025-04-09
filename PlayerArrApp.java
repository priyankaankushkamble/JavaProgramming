import java.util.*;
class Player
{  
	private int id;
	private String name;
	private int run;
   
   	public void setId(int id)
   	{ 
		this.id=id;
   	}
   		public int getId()
		{
      	return id;
   		}
   public void setName(String name)
   { 
		this.name=name;
   }
   		public String getName()
		{
     	return name;
   		}
   public void setRun(int run)
   { 
		this.run=run;
   }
  		public int getRun()
		{
    	 	return run;
   		}
}
public class PlayerArrApp
{    
	public static void main(String x[])
    { 	
          Player p1[]=new Player[5]; //array of reference 
		 Scanner xyz  = new Scanner(System.in);
		 for(int i=0;i<p1.length;i++)
		 {  
		   p1[i]=new Player(); //array of objects
		   System.out.println("enter name id and run of player");
		   String name=xyz.nextLine ();
		   int id=xyz.nextInt();
		   int run=xyz.nextInt();
		   p1[i].setId(id);
		   p1[i].setName(name);
		   p1[i].setRun(run);
		   xyz.nextLine();
		}
		System.out.println ("Display all player records");
		for(int i=0;i<p1.length;i++)
		{ 
		System.out.println(p1[i].getName()+"\t"+p1[i].getId()+"\t"+p1[i].getRun());
		}
		System.out.println("Enter id of player for search");
		int skey=xyz.nextInt();
		boolean b=false;
		for(int i=0; i<p1.length;i++)
		{  
			int pid=p1[i].getId();
			if(pid==skey)
			{ 
			  b=true;
			  break;
			}
		}
		if(b)
		{
				System.out.println ("Player found");
		}
		else
			{
		  		System.out.println("Player not found");
			}
	}
}

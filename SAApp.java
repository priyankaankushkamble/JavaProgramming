class Table
{
	void showTable(int no)
	{
	try{

		for(int i=1;i<=10;i++)
		{
		System.out.printf("%d X %d = %d\n",i,no,i*no);
		Thread.sleep(10000);
		}
	}
	catch(Exception ex)
	{
		System.out.println("Error is "+ ex);
	}
	}
}
class Two extends Thread
{
	Table table;
	void setTable(Table table)
	{
		this.table=table;
	}
	public void run()
	{
	table.showTable(2);
	}
}
class Three extends Thread
{
	Table table;
	void setTable(Table table)
	{
		this.table=table;
	}
	public void run()
	{
	table.showTable(3);
	}
}
public class SAApp
{
	public static void main(String x[])
	{
	 Table t1=new Table();
	 Two tw=new Two();
	 tw.setTable(t1);
	tw.start();

	Three th=new Three();
	th.setTable(t1);
	th.start();
	}
}
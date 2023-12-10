public class Ex
{
	int no_of_tickets;
	static int total_no_of_tickets;
	
	Ex(int n)
	{
		no_of_tickets=n;
		total_no_of_tickets+=n;//totalticktes=n+totaltickets
	}
	void display()
	{
		System.out.println("no of tickets in ganesh"+" "+no_of_tickets);
	}
	static void display1()
	{
		System.out.println("total no of tickets"+total_no_of_tickets);
	}
	public static void main(String args[])
	{

		Ex ganesh=new Ex(5);
		Ex kumar=new Ex(4);
		ganesh.display();
		kumar.display();
		display1();
		
	}
}
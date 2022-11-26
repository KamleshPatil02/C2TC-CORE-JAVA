package com.cg.corejava.Day11;

public class JoinDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Kamlesh k=new Kamlesh();
		k.start();
		k.join(3000,50);   //one tread Waiting for the other thread to complete its execution ----join()
		
		for(int i=0;i<10;i++)
		{
			
					System.out.println("I Am Hetvik");
		}
			
	}

}
class Kamlesh extends Thread
{
	public void run()
	{
			
		for(int i=0;i<10;i++)
		{
			
			System.out.println("I Am Kamlesh");
		}
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			
		}
	}
}
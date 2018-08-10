package org.comviva.thread;

public class BusinessLogic extends Thread
{
	
	
	@Override
	public void run() 
	{
		businessLogic();
	}


	private void businessLogic() 
	{
		for(int i=0;i<500;i++)
		{
			System.out.println("i value in "+this.getName()+"="+i);
			try {
				sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}

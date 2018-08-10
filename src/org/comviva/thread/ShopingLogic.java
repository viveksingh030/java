package org.comviva.thread;

public class ShopingLogic extends Rule implements Runnable
{
	private String name;
	private int priority;
	private Thread thread;
	
	
	//you can not call run method directly
		//doing this you make this single threaded program
		//just call thread.start() method 
		//it will automatically call run method
		
	public ShopingLogic(String name,int priority)
	{
		this.name=name;
		this.priority=priority;
		thread=new Thread(this,name);
		thread.start();
	}
	public ShopingLogic()
	{
		
	}
	@Override
	public void run()
	{
		for(int i=0;i<400;i++)
		{
			System.out.println("i value is "+i+ " in "+Thread.currentThread().getName()+" with Priority "+Thread.currentThread().getPriority());
		}
		System.out.println("Exiting "+Thread.currentThread().getName());
	}
	
}

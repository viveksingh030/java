package org.comviva.thread;

public class Queue 
{
	private int n;
	boolean value=false;
	public synchronized void get()
	{   
		if(!value)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" Get "+n);
		value=!value;
		notify();
		
	}
	public synchronized void put(int put)
	{  
		if(value)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" Put "+put);
		this.n=put;
		value=!value;
		notify();
	}
}

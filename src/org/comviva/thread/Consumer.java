package org.comviva.thread;

public class Consumer implements Runnable
{
	private Queue q;
	public Consumer(String name,Queue q)
	{
		this.q=q;
		new Thread(this,name).start();
	}
	@Override
	public void run() 
	{   int i=1;
		while(true)
		{
			q.get();
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

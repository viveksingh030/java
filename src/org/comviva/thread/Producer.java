package org.comviva.thread;

public class Producer implements Runnable
{
	private Queue q;
	public Producer(String name,Queue q)
	{
		this.q=q;
		new Thread(this,name).start();
	}
	@Override
	public void run() 
	{   int i=1;
		while(true)
		{
			q.put(i++);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

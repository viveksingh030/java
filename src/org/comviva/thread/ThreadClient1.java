package org.comviva.thread;

public class ThreadClient1 {

	public static void main(String[] args) throws InterruptedException 
	{
        System.out.println("Main Thread is "+Thread.currentThread().getName());
        
		/*BusinessLogic businessLogic=new BusinessLogic();
		businessLogic.setName("child");
		businessLogic.start();
		businessLogic.setPriority(Thread.NORM_PRIORITY);*/
		
        /*
         * 
         * 
         * ShopingLogic shopingLogic=new ShopingLogic("child",Thread.NORM_PRIORITY+1);
        ShopingLogic shopingLogic1=new ShopingLogic("child",Thread.NORM_PRIORITY+2);
        ShopingLogic shopingLogic2=new ShopingLogic("child",Thread.NORM_PRIORITY+3);
        
        */
        ShopingLogic shopingLogic=new ShopingLogic();
        Thread t1=new Thread(shopingLogic,"vivek");
        Thread t2=new Thread(new ShopingLogic(),"vinay");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
		for(int i=0;i<100;i++)
		{
			System.out.println("i value in"+Thread.currentThread().getName()+"="+i+" with Priority "+Thread.currentThread().getPriority());
			try
			{
				Thread.sleep(1000);
			}catch (Exception e) 
			{
				System.out.println(e.toString());
			}
		}
		t1.join(1000);
		t2.join(1000);
		System.out.println(Thread.currentThread().getName()+" Exiting");
	}

}

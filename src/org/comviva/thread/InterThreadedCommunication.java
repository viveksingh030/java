package org.comviva.thread;

public class InterThreadedCommunication {

	public static void main(String[] args) 
	{
		Queue q=new Queue();
		Producer producer=new Producer("producer",q);
		Consumer consumer=new Consumer("Consumer",q);

	}

}

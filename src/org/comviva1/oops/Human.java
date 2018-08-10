package org.comviva1.oops;

public class Human extends Eyes implements Animal
{

	@Override
	public void talk() 
	{
		System.out.println("Human Talk");
		
	}

	@Override
	public void walk() 
	{
		
		System.out.println("Human Walk with two legs");
	}

	@Override
	public void shout()
	{
		System.out.println("Human Shouts not loudly");
		
	}

}

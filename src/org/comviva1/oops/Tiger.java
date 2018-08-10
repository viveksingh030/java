package org.comviva1.oops;

public class Tiger implements Animal
{

	@Override
	public void talk() 
	{
		
		System.out.println("grr ...grrr");
	}

	@Override
	public void walk() 
	{
		System.out.println("TIGER WALKS WITH 2 LEG AND 2 LIMBS");
		
	}

	@Override
	public void shout()
	{
		System.out.println("GRR...GRRR");
	}
	
	public void killAndEat()
	{
		System.out.println("Tiger Kills And Eats");
	}

}

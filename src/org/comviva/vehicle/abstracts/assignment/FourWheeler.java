package org.comviva.vehicle.abstracts.assignment;

public abstract class FourWheeler extends Vehicle
{
	public FourWheeler(int haveSeat) 
	{
		this.haveSeat=haveSeat;
	}
	@Override
	public void noOfWheel() 
	{
		
		System.out.println("has Four wheels");
	}
	@Override
	public void runsOn() 
	{
		System.out.println("Generally RUns On Petrol");
		
	}
}

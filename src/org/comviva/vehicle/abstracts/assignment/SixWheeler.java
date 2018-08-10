package org.comviva.vehicle.abstracts.assignment;

public abstract class SixWheeler extends Vehicle
{
	public SixWheeler(int haveSeat) 
	{
		this.haveSeat=haveSeat;
	}
	@Override
	public void noOfWheel() 
	{
		
		System.out.println("has Six wheels");
	}
	
	@Override
	public void runsOn()
	{
		System.out.println("generally runs On Diesel");
		
	}
	
}

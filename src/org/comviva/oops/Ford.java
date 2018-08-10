package org.comviva.oops;

public class Ford extends Car
{
	
	public Ford(int fuelCapacity)
	{
		super(fuelCapacity);
		System.out.println("Car Fording is Created");
	}
	
	public  void musicPlayer() 
	{
		System.out.println("Ford Come With Music Player");
	}
	@Override
	public void door()
	{
		System.out.println("FOrd has doors 2+2");
	}
}

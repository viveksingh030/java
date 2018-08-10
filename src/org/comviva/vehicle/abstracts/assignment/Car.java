package org.comviva.vehicle.abstracts.assignment;

public class Car extends FourWheeler 
{
	private int fuelCapacity;

	public Car(int haveSeat,int fuelCapacity)
	{
		super(haveSeat);
		this.fuelCapacity = fuelCapacity;
	}
	public int getFuleCapacity()
	{
		return fuelCapacity;
	}
	public void door()
	{
		System.out.println("All Cars come with 4+1 doors");
	}
	@Override
	public void doors()
	{
		
		System.out.println(" Car Has 2 dorrs ");
	}
	@Override
	public void mileage() 
	{
		System.out.println("Car has 20 to 30 Mileage");
	}
	
}

package org.comviva.oops;

public class Car 
{
	private int fuelCapacity;

	public Car(int fuelCapacity) {
		super();
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
	
}

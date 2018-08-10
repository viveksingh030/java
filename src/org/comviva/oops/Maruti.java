package org.comviva.oops;

public class Maruti extends Car{
	boolean isabs;

	public Maruti(int fuelCapacity,boolean isAbs) {
		super(fuelCapacity);
		this.isabs=isAbs;
		System.out.println("Car Maruti is Created");
	}

	public boolean isIsabs() {
		return isabs;
	}
	public void carWheels()
	{
	System.out.println("Maruti Radial Wheel");
	}
	@Override
	public void door()
	{
		System.out.println("Maruti has doors 2+1");
	}
	
}

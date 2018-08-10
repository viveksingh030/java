package org.comviva.vehicle.abstracts.assignment;

public class Truck extends SixWheeler {

	public Truck(int haveSeat)
	{
		super(haveSeat);
		
	}

	@Override
	public void doors() 
	{
		System.out.println("Truck Has 2 doors");

	}

	@Override
	public void mileage() 
	{
		System.out.println("Truck Has Mileage 20 to 25");

	}
	@Override
	public void runsOn() {
	   System.out.println("Truck Runs on Diesel");
	}

}

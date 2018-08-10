package org.comviva.vehicle.abstracts.assignment;

public class Bus extends SixWheeler {
	public Bus(int haveSeat)
	{
		super(haveSeat);
		
	}

	@Override
	public void doors() {
		System.out.println("Bus has 4 Doors");

	}

	@Override
	public void mileage() 
	{
		System.out.println("Bus Has Milage 30 to 40 KMH");

	}
	

}

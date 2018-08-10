package org.comviva.vehicle.abstracts.assignment;

public class VehicleDisplay
{
	public void disply(Vehicle vehicle)
	{
		System.out.println(vehicle.haveSeat);
		vehicle.doors();
		vehicle.mileage();
		vehicle.runsOn();
		vehicle.noOfWheel();
	}
}

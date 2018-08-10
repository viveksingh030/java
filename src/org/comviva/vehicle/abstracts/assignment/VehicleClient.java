package org.comviva.vehicle.abstracts.assignment;

public class VehicleClient {

	public static void main(String[] args) 
	{
		Vehicle[] v=new Vehicle[4];
		v[0]=new Bus(30);
		v[1]=new Truck(1);
		v[2]=new Maruti(2,40,true);
		v[3]=new Ford(2,50);
		VehicleDisplay vehicleDisplay=new VehicleDisplay();
		for(Vehicle vehicle:v)
		{
			
			vehicleDisplay.disply(vehicle);
		}
	}

}

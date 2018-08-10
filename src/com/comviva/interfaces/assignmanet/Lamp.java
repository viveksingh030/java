package com.comviva.interfaces.assignmanet;

public class Lamp implements Device {

	@Override
	public void on() 
	{
		System.out.println("lamp is on");
	}

	@Override
	public void off() 
	{
		
		System.out.println("lamp is off");
	}

}

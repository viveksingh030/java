package com.comviva.interfaces.assignmanet;

public class Projector implements Device {

	@Override
	public void on()
	{
		System.out.println("Projector Is On");
	}

	@Override
	public void off() 
	{
		System.out.println("Projector Id off");
	}

}

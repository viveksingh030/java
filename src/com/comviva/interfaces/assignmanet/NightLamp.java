package com.comviva.interfaces.assignmanet;

public class NightLamp extends Lamp implements Device
{
	@Override
	public void on() 
	{
		System.out.println("NightLamp Is On");
	}
	@Override
	public void off() 
	{
		System.out.println("NightLamp Is off");
	}
}

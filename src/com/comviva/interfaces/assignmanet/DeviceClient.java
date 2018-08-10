package com.comviva.interfaces.assignmanet;

public class DeviceClient 
{
	public static void main(String[] args) 
	{
		Device device[]=new Device[3];
		device[0]=new Lamp();
		device[1]=new NightLamp();
		device[2]=new Projector();
		DeviceHandler deviceHandler=new DeviceHandler();
		
		for(Device d:device)
		{
			deviceHandler.handle(d);
		}
	}

}

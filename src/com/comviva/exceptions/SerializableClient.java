package com.comviva.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.comviva.fileHandling.Devices;

public class SerializableClient {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{   Devices device=new Devices(101, "bulb", 40);
		storDevice(device);
		findObject();
	}

	
	private static void findObject() throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("name.txt"));
		Devices device1=(Devices) ois.readObject();
		System.out.println(device1);
		
	}

	
	private static void storDevice(Devices device) throws FileNotFoundException, IOException 
	{
		
         ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("name.txt")));
		
		 oos.writeObject(device);
		 oos.close();
		
	}

}

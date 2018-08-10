package org.comviva1.oops;

public class AnimalHandler
{
	public  void display(Animal animal)
	{   
		System.out.println("*************************************************");
		
		animal.walk();
		animal.talk();
		animal.shout();
		
		
		if(animal instanceof Human)
		{
			((Human) animal).eyeColour();
			((Human) animal).specilaCharEyes();
		}
		
		if(animal instanceof Tiger)
		{
			((Tiger) animal).killAndEat();
		}
	}
}

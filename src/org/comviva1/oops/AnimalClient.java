package org.comviva1.oops;

public class AnimalClient
{   
	public static void main(String[] args)
	{
		AnimalHandler animalHandler=new AnimalHandler();
		
		Animal animal[]=new Animal[2];
		
		
		animal[0]=new Human();
		animal[1]=new Tiger();
		
		
		
		for(Animal an:animal)
		{
			animalHandler.display(an);
		}
	}
}

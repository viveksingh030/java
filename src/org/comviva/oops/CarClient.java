package org.comviva.oops;

public class CarClient 
{
	
	public static void doMyJob(Car c)
	{
		System.out.println("Car Details goes Here.....");
		c.door();
		if(c instanceof Ford)
		{
			((Ford) c).musicPlayer();
		}
		else if(c instanceof Maruti)
		{
			System.out.println("c is Isabs "+((Maruti)c).isabs);
			((Maruti)c).carWheels();
		}
		System.out.println(c.getFuleCapacity());
		System.out.println();
		System.out.println();
	}
	public static void main(String[] args)
	{   
		
		Car []cars=new Car[5];
		cars[0]=new Ford(45);
		cars[1]=new Maruti(40,true);
		
		cars[2]=new Ford(40);
		cars[3]=new Maruti(34, false);
		
		cars[4]=new Ford(65);
		for(Car c:cars)
		{
		doMyJob(c);
		}
		
		
		
		
		
		
		
		
		
		/*
		 * Car c;
		c=new Ford(40);
		c.door();
		doMyJob(c);
		((Ford)c).musicPlayer();
		
		
		Ford ford=new Ford(50);
		ford.door();
		ford.musicPlayer();
		
		
		Maruti maruti=new Maruti(45,true);
		maruti.door();
		ford.door();
		
		
		System.out.println("maruti fuel capacity is "+maruti.getFuleCapacity());*/
	}

}

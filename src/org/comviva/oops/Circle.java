package org.comviva.oops;

public class Circle extends Shape
{
	public double radius;
	public Circle(double rad) {
		this.radius=rad;
	}
	@Override
	public double area()
	{
		
		return Math.PI*radius*radius;
	}

	@Override
	public void draw()
	{
		
		System.out.println("CIRCLE IS BEING DRAWN");
	}

}

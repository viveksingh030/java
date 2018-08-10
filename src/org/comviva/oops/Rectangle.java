package org.comviva.oops;

public class Rectangle extends Shape
{
    public double width;
    public double breadth;
	public Rectangle(double width, double breadth) {
		super();
		this.width = width;
		this.breadth = breadth;
	}

	@Override
	public double area() 
	{
		return breadth*width;
	}

	@Override
	public void draw() 
	{
		System.out.println("Reactangle is being drawn");
		
	}

}

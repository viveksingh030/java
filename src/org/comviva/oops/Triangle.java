package org.comviva.oops;

public class Triangle extends Shape
{  
	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}
	public double height;
	public double base;
	@Override
	public double area() {
		
		return 0.5*height*base;
	}
	@Override
	public void draw()
	{
		
		System.out.println("Triangle is being drawn");
		
	}

}

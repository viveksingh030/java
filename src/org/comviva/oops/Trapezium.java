package org.comviva.oops;

public class Trapezium extends Shape
{
	public double parallerside1;
	public double parallerside2;
	public double height;
	@Override
	public double area()
	{
		
		return 0.5*(parallerside1+parallerside2)*height;
	}
	public Trapezium(double parallerside1, double parallerside2, double height) {
		super();
		this.parallerside1 = parallerside1;
		this.parallerside2 = parallerside2;
		this.height = height;
	}
	@Override
	public void draw()
	{
		System.out.println("Trapezium is being drawn");
		
	}

}

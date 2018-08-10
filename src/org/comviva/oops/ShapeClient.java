package org.comviva.oops;

public class ShapeClient {

	public static void main(String[] args) 
	{
	 Shape []shapes=new Shape[4];
	 shapes[0]=new Rectangle(12, 13);
	 shapes[1]=new Circle(5);
	 System.out.println(shapes[0].area());
	 System.out.println(shapes[1].area());
	}

}

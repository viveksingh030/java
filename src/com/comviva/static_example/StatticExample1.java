package com.comviva.static_example;

public class StatticExample1
{
	static int x=33;
	
	public static<T extends Number> double add(T n1,T n2)
	{  
		System.out.println("value of x="+x);
		return n1.doubleValue()+n2.doubleValue();
		
	}
	public static<T extends Number> double divide(T a,T b)
	{
		try
		{
			return a.doubleValue()/b.doubleValue();
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		finally {
			
		}
		return 0;
	}
	
	static
	{
		System.out.println("I am from first static block");
		System.out.println("x="+x);
	}
	
	static {
		System.out.println("This is from second static block");
		x=34;
	}
	public static void main(String[] args) 
	{
		System.out.println(add(5, 6));
		
		System.out.println(add(5.4, 3.7));
		
		System.out.println();
	}

}

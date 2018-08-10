package com.comviva.exceptions;
public class Excexption1 {

	public static void main(String[] args) 
	{
		int res;
		int num1=10;
		int num2=4;
		int num3=0;
	    try
	    {
	    	try
		    {
		    	int arr[]=new int[-4];
		    	arr[0]=3;
		    }catch(NegativeArraySizeException e)
		    {
		    	System.out.println("neagative array size exception");
		    }
		    try
		    {
		    	int arr[]=new int[3];
		    	arr[5]=5;
		    }catch(ArrayIndexOutOfBoundsException e)
		    {
		    	System.out.println("array index out of bound exception");
		    }
		    try
		    {
		    	res=num1/num3;
		    	res=num1/num2;
		    	System.out.println(res);
		    }catch(ArithmeticException e)
		    {
		    	System.out.println("you have divided by zero.Dont do that");
		    }
	    }catch(Exception e)
	    {
	    	System.out.println("Something goes wrong with your code!");
	    }
	    finally {
			System.out.println("finally i am here!");
		}
		System.out.println("some other work goes here!");
		System.gc();
	}

}

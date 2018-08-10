package com.comviva.exceptions;

public class NameTwoSmallException extends Exception 
{
	private String msg;
	public NameTwoSmallException()
	{
		this.msg="name two small exception";
	}
	public NameTwoSmallException(String name) 
	{
		this.msg=name;
	}
	@Override
	public String getMessage() {
		
		return this.msg;
	}
	@Override
	public String toString() {
		
		return "::::"+msg+"::::::";
	}
	
}

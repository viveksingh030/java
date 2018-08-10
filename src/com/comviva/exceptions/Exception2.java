package com.comviva.exceptions;

import java.io.IOException;

import javax.management.RuntimeErrorException;

//use the exception written by java and give your BL

public class Exception2 
{
	
	
	public static void checkname(String name) throws NameTwoSmallException
	{
		if(name.length()<5)
		{
			throw new NameTwoSmallException("Sorry you name cant have less than 5 chars");
		}
	}
	public static void checkincometax(int salary,int taxAmount,String name)throws IOException, NameTwoSmallException
	{
		try
		{
			if(salary<10000)
			{
				checkname(name);
			throw new RuntimeException("sorry you dont have to pay tax"+name);
			}
			
			
			else if (taxAmount>=10000&&taxAmount<=20000) {
				throw new IOException("Good to Mr/Ms/Mrs."+name+",but have accountant");
				
			}
			
			
			else
			{
				System.out.println("Pay using officeial site");
			}
			
		}catch(RuntimeException re)
		{
			throw new RuntimeException("Something went wrong from caller,"+re);
		}
		catch(NameTwoSmallException nts)
		{
			throw new NameTwoSmallException("something wrong with name,"+nts);
		}
	}
	public static void main(String[] args)
	{
		try
		{
		checkincometax(1000, 200, "bret");
		}catch (IOException e) {
			e.printStackTrace();
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		catch (NameTwoSmallException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("some other business logic");
	}

}

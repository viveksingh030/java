package com.comviva.static_example;

public class EmployeeImp {

	public static void main(String[] args)
	{
		Employee employee=new Employee("Vivek kUmar Singh",30000);
		
		Employee employee1=new Employee("Vinay kUmar Singh",40000);
		
		
		Employee employee2=new Employee("Vikash kUmar Singh",50000);
		
		System.out.println(employee);
		System.out.println(employee1);
		System.out.println(employee2);
		
		System.out.println("Total Number Of Employee="+Employee.count);
	}

}

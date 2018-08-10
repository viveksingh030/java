package com.comviva.static_example;

public class Employee 
{
	static int count=0;
	private int employee_id;
	
	private String employeeName;
	
	private int income;
	
	public int getEmployee_id() 
	{
		return employee_id;
	}
	
	
	public Employee(String employeeName, int income) 
	{
		super();
		this.employee_id =++count;
		this.employeeName = employeeName;
		this.income = income;
	}
	
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	
	
	public int getIncome()
	{
		return income;
	}
	
	
	@Override
	public String toString()
	{
		return "Employee [employee_id=" + employee_id + ", employeeName=" + employeeName + ", income=" + income + "]";
	}
	
	
	public void setIncome(int income) 
	{
		this.income = income;
	}
}

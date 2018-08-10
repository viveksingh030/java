package com.comviva.collections;

public class Employee 
{ 
	private int empid;
	private String empName;
	private double salery;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalery() {
		return salery;
	}
	public void setSalery(double salery) {
		this.salery = salery;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salery=" + salery + "]";
	}
	public Employee(int empid, String empName, double salery) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salery = salery;
	}
	
}

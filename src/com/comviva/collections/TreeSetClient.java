package com.comviva.collections;
import java.util.*;
public class TreeSetClient
{
	public static void main(String[] args)
	{
		TreeSet<Employee> treeSet=new TreeSet<>((a,b)->b.getEmpName().compareTo(a.getEmpName()));
		treeSet.add(new Employee(101, "Vivek", 42334234));
		treeSet.add(new Employee(101, "Suraj", 42334234));
		treeSet.add(new Employee(101, "Arun", 42334234));
		treeSet.forEach((e)->System.out.println(e));
	}
}

package com.comviva.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Listexample2 {

	public static void main(String[] args)
	{
		Vector<String> vector=new Vector<>(10,5);
		System.out.println("vector size="+vector.size()+"\t"+"vector capacity is"+vector.capacity());
		vector.addElement("vivek");
		vector.add("santosh");
		vector.add("arun");
		vector.addElement("vivek");
		vector.add("santosh");
		vector.add("arun");
		vector.addElement("vivek");
		vector.add("santosh");
		vector.add("arun");
		vector.addElement("vivek");
		vector.add("santosh");
		vector.add("arun");
		Enumeration<String> enumeration=vector.elements();
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
		System.out.println("vector size="+vector.size()+"\t"+"vector capacity is"+vector.capacity());
	}

}

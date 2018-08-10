package com.comviva.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListExample2
{
	public static void main(String[] args) 
	{   
		ArrayList<String> arrayList=new ArrayList<>();
		System.out.println("initial Size of arraylist="+arrayList.size());
		arrayList.add("vivek");
		arrayList.add("vinay");
		arrayList.add("rajendra");
		arrayList.forEach((e)->System.out.println(e));
		System.out.println("ArrayList Size now is "+arrayList.size());
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.contains("vinay"));
		/*ArrayList<? extends Number> arrayList2=new ArrayList<>();*/
		
		
	}
}

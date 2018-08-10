package com.comviva.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

import com.comviva.fileHandling.Devices;

public class ArrayListExample {

	public static void main(String[] args) {
		//Non generic Example
		//It has advantage that it can store any type of object
		//But it is not type safe
		ArrayList arrayList=new ArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add("vivek");
		arrayList.add(new Devices(102, "mobile", 40000));
		arrayList.add(false);
		
		//forEach loop Iteration
		arrayList.forEach((e)->System.out.println(e));
		
		//Use of Iteration to iterate arrayList
		Iterator iterator=arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		//Generic Exmaple of ArrayList
		ArrayList<String> arrayList1=new ArrayList<>();
		arrayList1.add("vivek");
		arrayList1.add("vinay");
		
		//USe ot spliterator to iterate arrayList
		
		Spliterator<String> spliterator=arrayList1.spliterator();
		while(spliterator.tryAdvance((e)->System.out.println(e)));
		int index=1;
		
		System.out.println(arrayList1.get(index));
		
		//convert ArrayList to array
		String a[]=new String[arrayList1.size()];
		a=arrayList1.toArray(a);
		for(String s:a)
		{
			System.out.println(s);
		}

	}

}

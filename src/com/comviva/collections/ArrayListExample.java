package com.comviva.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		
		//checking  that object is present int list or not
		System.out.println(arrayList1.contains("vivek"));
		
		//adding a collection to list
		System.out.println("arrayList Contains");
		System.out.println("********************************************************");
		arrayList.addAll(arrayList1);
		arrayList.forEach((e)->System.out.println(e));
		
		//find the index of object in arrayList
		System.out.println("index of vivek in arrayList is");
		System.out.println("**********************************");
		System.out.println(arrayList.indexOf("vivek"));
		
		//find the sublist Of arrayList
		System.out.println("sublist from index 3 to 5");
		System.out.println("*****************************************");
		arrayList.subList(3, 6).forEach((e)->System.out.println(e));
		
		//sort the content in not increasing order
		System.out.println("Contents are now in decreasing order");
		System.out.println("*********************************");
		arrayList1.sort(Collections.reverseOrder());
		arrayList1.forEach((e)->System.out.println(e));
		
		
		//sort contents of arrayList in non decreasing order
		arrayList1.sort(new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) 
			{
				return arg0.compareTo(arg1);
				
			}
		});
		System.out.println("Contents are now in decreasing order");
		System.out.println("*********************************");
		arrayList1.forEach((e)->System.out.println(e));
		
	}
}


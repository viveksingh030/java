package com.comviva.collections;
import java.util.ArrayList;

import com.comviva.fileHandling.Devices;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add("vivek");
		arrayList.add(new Devices(102, "mobile", 40000));
		arrayList.add(false);
		arrayList.forEach((e)->System.out.println(e));

	}

}

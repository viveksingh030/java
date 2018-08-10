package org.comviva.oops;

public class MyTest {
	
	public static void main(String[] args) {
	DoSomeWork<String> doSomeWork=(str)->{
	 return new StringBuffer(str).reverse().toString();
	};
	System.out.println(doSomeWork.fun("geeksforgeeks"));
	DoSomeWork<Integer> doSomeWork2=(intg)->{
		int i,fact=1;
		for(i=1;i<=intg;i++)
		{
			fact*=i;
		}
		return fact;
	};
	System.out.println(doSomeWork2.fun(6));
}
}

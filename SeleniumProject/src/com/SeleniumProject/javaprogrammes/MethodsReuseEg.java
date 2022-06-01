package com.SeleniumProject.javaprogrammes;

public class MethodsReuseEg {

	public static void main(String[] args) {
		
//		MethodsOps.Function1();

		MethodsOps mo = new MethodsOps();
//		mo.Function3();
		
		int res = mo.sum(300, 700);
		System.out.println(res);
		
		res = mo.sum(1000, 3000, 6000);
		System.out.println(res);
		
		double x = mo.sum(23423.34, 5455.45);
		System.out.println(x);
		
		String f = mo.Function2();
		System.out.println(f);
	}

}

package com.SeleniumProject.javaprogrammes;

public class NestedIFEg {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 70;
		int c = 70;
		
//		System.out.println(a > b && a > c);
		
		if(a > b && a > c)
		{
			System.out.println("A is Greater");
		}
		else if(b > c && b > a)
		{
			System.out.println("B is Greater");
		}
		else if (c > a && c > b) {
			System.out.println("C is Greater");
		}
		else
		{
			System.out.println("Assign proper values to the Variables");
		}

		
	}

}

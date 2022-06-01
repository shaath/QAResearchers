package com.SeleniumProject.javaprogrammes;

public class MethodsOps 
{

	public static String course = "Selenium";
	public int salary = 200000;
	
	public static void main(String[] args) 
	{
		Function1();
		String res = Function2();
		System.out.println(res);
		
		MethodsOps mo = new MethodsOps();
		mo.Function3();
		System.out.println(mo.course);
		System.out.println(mo.salary);
		
		boolean flag = mo.Function4();
		System.out.println(flag);
		
	}
	
	//Static method without returning value
	public static void Function1()
	{
		System.out.println("This is Function1 code");
	}
	
	//Static method with returning value
	public static String Function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}

	//non Static method without returning any value
	public void Function3()
	{
		System.out.println("This is Function3 code");
	}
	
	//Non static method with returning value
	public boolean Function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	public static int sum(int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	public static int sum(int a, int b, int c)
	{
		int d = a + b + c;
		return d;
	}
	
	public static double sum(double a , double b)
	{
		double c = a + b;
		return c;
	}
}

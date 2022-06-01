package com.SeleniumProject.javaprogrammes;

public class ConstructorEg {

	
	public ConstructorEg()
	{
		System.out.println("This is ConstructorEg class Code");
	}
	
	public ConstructorEg(String course, int days){
		System.out.println("I am learning "+course);
		System.out.println("It will take "+days+" days to complete.");
	}
	
	public static void main(String[] args) 
	{
		ConstructorEg ce = new ConstructorEg("Selenium", 45);
		
		ConstructorEg ce1 = new ConstructorEg();

	}

}

package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		String[] course = new String[5];
		
		System.out.println(course.length);
		
		course[1] = "Selenium";
		course[3] = "Manual";
		course[1] = "Apple";
		
//		System.out.println(course[1]);
		
//		for (int i = 0; i < course.length; i++) 
//		{
//			System.out.println(course[i]);
//		}
		
		for(String data:course)
		{
			System.out.println(data);
		}
		
	}

}

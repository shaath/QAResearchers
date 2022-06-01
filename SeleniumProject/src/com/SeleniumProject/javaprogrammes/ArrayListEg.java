package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		al.add("Apple");
		al.add(200000);
		al.add(true);
		al.add("Apple");
		al.add('M');
		al.add(3243.432);
		al.add(6, "Selenium");
		al.add(2, "Boll");
		
		al.set(2, "Manual");
		
		al.remove(3);
		
		al.clear();
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.size());
		
//		System.out.println(al.get(2));
		
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		

	}

}

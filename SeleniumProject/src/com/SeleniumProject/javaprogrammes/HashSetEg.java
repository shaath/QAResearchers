package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Selenium");
		hs.add("Apple");
		hs.add("Roman");
		hs.add("Siva");
		hs.add("Vinay");
		hs.add("Apple");
		
//		for(String data:hs)
//		{
//			System.out.println(data);
//		}
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext())
		{
			String data = it.next();
			System.out.println(data);
		}

	}

}

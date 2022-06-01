package com.SeleniumProject.javaprogrammes;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(20, "Selenium");
		map.put(40, "Manual");
		map.put(100, "Apple");
		
//		System.out.println(map);
		
//		for(Map.Entry<Integer, String> m: map.entrySet() )
//		{
//			System.out.println(m.getKey()+"----"+m.getValue());
//		}
		
//		System.out.println(map.get(40));
		
//		System.out.println(map.isEmpty());
//		
//		System.out.println(map.keySet());
//		
//		System.out.println(map.size());
//		
//		System.out.println(map.values());
//		
//		System.out.println(map.remove(40));
//		
//		System.out.println(map);
		
		map.replace(40, "Boll");
		map.replace(1000, "Apple", "Sharat");
//		System.out.println(map);
		
		map.put(40, "Year");
		System.out.println(map);
	}

}

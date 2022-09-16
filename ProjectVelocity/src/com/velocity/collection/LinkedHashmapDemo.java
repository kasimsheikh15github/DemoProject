package com.velocity.collection;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashmapDemo {

	public static void main(String[] args) {

		
		LinkedHashMap<String, String> map= new LinkedHashMap<String,String>();
		
		map.put("102", "Pune");
		map.put("104", "Banglore");
		map.put("106", "Delhi");
		
		Set<String> set = map.keySet();

		for(String str : set) {
			System.out.println(str);
			System.out.println(map.get(str));
		}
		
	}

}

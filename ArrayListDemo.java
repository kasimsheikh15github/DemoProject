package com.velocity.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("sagar","sawant","sushil","vinod");
		
	     Iterator<String> itr = list.iterator();
	     
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
		
		
	}

}





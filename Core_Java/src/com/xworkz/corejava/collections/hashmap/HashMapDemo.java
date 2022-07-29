package com.xworkz.corejava.collections.hashmap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap hashmap = new HashMap();
		
		hashmap.put(2, 'B');
		hashmap.put(3, 'C');
		hashmap.put(1, 'A');
		hashmap.put(4, 'D');
		hashmap.put(5, 'E');
		
		System.out.println(hashmap);
		
	}
}

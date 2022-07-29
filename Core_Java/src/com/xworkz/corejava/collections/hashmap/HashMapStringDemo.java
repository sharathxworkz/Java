package com.xworkz.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapStringDemo {

	public static void main(String[] args) {

		HashMap<String,String> hashmap = new HashMap<String,String>();
			hashmap.put("Banglore", "560026");
			hashmap.put("Mysore", "345214");
			hashmap.put("Manglore", "75561");
			hashmap.put("Saklleshpura", "546752");
			hashmap.put("ChikkaMangaluru", "7231567");
			
			System.out.println(hashmap);
			
			System.out.println("Pincode of Mysore is: "  + hashmap.get("Mysore"));
			
			for (Map.Entry<String, String> entry :hashmap.entrySet()) {
				
					if(entry.getKey().equals("Mysore") | entry.getKey().equals("Banglore")){
						System.out.println(entry.getKey() + " : "+ entry.getValue());
					}
				
			}
	}

}

package com.xworkz.corejava.strings;

public class StringDemo {
	
	public static void main(String[] args) {
		String name = "shankar";
		String name1 = "shankar";//same reference is provided for name1 in scp
		
		System.out.println(name == name1);
		
		String vanitha = new String("vanitha"); // 2 objects are created 1 in heap.
												// And other in scp.
		
		String interVanitha = vanitha.intern(); // used to get the  address form scp.
		
		System.out.println(vanitha == interVanitha);
		
		String vani = interVanitha; // just assigning the value
		
		System.out.println(vani == interVanitha);
		
		name1 = "bhoomika"; // referance is changed from shankar to bhoomika.
		
		System.out.println(name == name1);
		
	}

}

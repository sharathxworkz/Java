package com.xworkz.jam.kissan.sales;

public class Jam {
	
	public static void main(String[] args) {
		
		System.out.println("Jam running in Main Method");
		
		Vendor vendor = new Vendor();
		String ven = vendor.getVendor();
		System.out.println(ven);
			
	}

}

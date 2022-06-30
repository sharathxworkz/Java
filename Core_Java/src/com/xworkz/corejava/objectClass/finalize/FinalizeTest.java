package com.xworkz.corejava.objectClass.finalize;

public class FinalizeTest {

	public static void main(String[] args) {
		
		Biriyani biriyani = new Biriyani("Dum Biriyani",150);
		System.out.println(biriyani);
		biriyani = null;
		
		System.gc();
		System.out.println(biriyani);
	}

}

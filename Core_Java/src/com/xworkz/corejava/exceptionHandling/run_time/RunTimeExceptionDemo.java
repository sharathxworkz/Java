package com.xworkz.corejava.exceptionHandling.run_time;

public class RunTimeExceptionDemo {
	
	public static void main(String[] args) {
		
		String animalName = "White_Tiger";
		animalName = null;
		System.out.println("Animal_Name is :" + animalName );
		System.out.println("Animal_Name word length is :"+ animalName.length());
	}

}

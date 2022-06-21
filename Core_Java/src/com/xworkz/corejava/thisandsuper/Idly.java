package com.xworkz.corejava.thisandsuper;

public class Idly extends Food {
	
	String name="Idly";
	String taste="Good";
	String color="White";
	double price=25.50;
	
	Idly(){
		System.out.println("Hello vada and Idly Good Combination");
	}
	
	Idly(String name,String taste,String color,double price){
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
	

}

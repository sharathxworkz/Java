package com.xworkz.corejava.constructor.parameterizedConstructor.exp2;

public class Exp2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tournment t = new Tournment("Takeshi_Martial_Art",100000,"Palama Island",21,"Adult");
		Tournment to = new Tournment("Takeshi_Casle",500000,"Ice_land",18,"Junior");
		
		System.out.println("Tournment Details");
		System.out.println("Name of The Tournment is:" + t.name);
		System.out.println("PriceMoney of The Tournment is:" + t.priceMoney+"$");
		System.out.println("Location of The Tournment is:" + t.location);
		System.out.println("Min Age to Enter The Tournment is:" + t.minAge);
		System.out.println("Division of The Tournment is:" + t.division);
		
		System.out.println();
		
		System.out.println("Tournment Details");
		System.out.println("Name of The Tournment is:" + to.name);
		System.out.println("PriceMoney of The Tournment is:" + to.priceMoney+"$");
		System.out.println("Location of The Tournment is:" + to.location);
		System.out.println("Min Age to Enter The Tournment is:" + to.minAge);
		System.out.println("Division of The Tournment is:" + to.division);
		

	}

}

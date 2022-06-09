package com.xworkz.corejava.constructor.parameterizedConstructor.exp2;

public class Tournment {
	
	String name;
	int priceMoney;
	String location;
	int minAge;
	String division;
	
	Tournment(String n, int m, String l, int a,String d){
		
		name = n;
		priceMoney = m;
		location = l;
		minAge = a;
		division = d;
		
	}
	
	void display() {
		
		System.out.println("Tournment Details are Mentioned Below:");
	}
}

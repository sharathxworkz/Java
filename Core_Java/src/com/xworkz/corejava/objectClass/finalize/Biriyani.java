package com.xworkz.corejava.objectClass.finalize;
//visibility is protected so need to override

public class Biriyani {
	
	String name;
	double price;

	Biriyani(String name,double price){
		this.name = name;
		this.price = price; 
	}

	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize Methood is Called..!!");
		
	}

	@Override
	public String toString() {
		return "Biriyani [name=" + name + ", price=" + price + "]";
	}

	
}


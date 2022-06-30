package com.xworkz.corejava.objectClass.clone.deep_copy.car;

public class MusicSystem {
	
	String brand;
	String connection;
	double price;

	MusicSystem(String brand,String connection,double price){
		this.brand = brand;
		this.connection = connection;
		this.price = price;
	}

	@Override
	public String toString() {
		return "MusicSystem [brand=" + brand + ", connection=" + connection + ", price=" + price + "]";
	}
	
	
	
}

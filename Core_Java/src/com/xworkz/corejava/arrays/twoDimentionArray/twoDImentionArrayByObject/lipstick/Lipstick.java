package com.xworkz.corejava.arrays.twoDimentionArray.twoDImentionArrayByObject.lipstick;

public class Lipstick {
	
	String brand;
	String color;
	float price;
	
	
	Lipstick(String brand, String color,float price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Lipstick [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
}

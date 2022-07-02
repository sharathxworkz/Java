package com.xworkz.corejava.arrays.twoDimentionArray.twoDImentionArrayByObject.watches;

public class Watches {

	String brand;
	String type;
	String material;
	int accuracy;
	double price;
	
	
	Watches(String brand,String type,String material,int accu,double price){
		this.brand = brand;
		this.type = type;
		this.material = material;
		this.accuracy = accu;
		this.price = price;
	}
	
//	public String Stringto() {
//		return []
//		
//	}

	@Override
	public String toString() {
		return "Watches [brand=" + brand + ", type=" + type + ", material=" + material + ", accuracy=" + accuracy
				+ ", price=" + price + "]";
	}
	
}

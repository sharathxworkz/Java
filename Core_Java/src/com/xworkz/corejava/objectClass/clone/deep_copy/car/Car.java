package com.xworkz.corejava.objectClass.clone.deep_copy.car;

public class Car implements Cloneable {

	String brand;
	String type;
	String color;
	double price;
	MusicSystem musicSystem;
	
		
	
	Car(String brand,String type,String color,double price,MusicSystem musicSystem){
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;
		this.musicSystem = musicSystem;
		
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", type=" + type + ", color=" + color + ", price=" + price + ", musicSystem="
				+ musicSystem + "]";
	}
	
	public Car clone() throws CloneNotSupportedException {
		Car car = (Car)super.clone();
		car.musicSystem = new MusicSystem("Boat","Wiered",10000);
		return car;
		
	}
}

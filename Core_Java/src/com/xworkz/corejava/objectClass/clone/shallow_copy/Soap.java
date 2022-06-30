package com.xworkz.corejava.objectClass.clone.shallow_copy;

import java.util.Objects;

public class Soap implements Cloneable{
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, color, price, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soap other = (Soap) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(type, other.type);
	}

	String brand;
	double price;
	String color;
	String type;

	Soap(String brand,double price,String color,String type){
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.type = type;
	}
	
	public Soap clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		Soap soap = (Soap)obj;
		return soap;
		
	}

	@Override
	public String toString() {
		return "Soap [brand=" + brand + ", price=" + price + ", color=" + color + ", type=" + type + "]";
	}
	
	
}
